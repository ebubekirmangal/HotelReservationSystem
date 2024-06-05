package com.tobeto.hotelReservationSystem.services.concretes;

import com.tobeto.hotelReservationSystem.core.utils.exceptions.types.BusinessException;
import com.tobeto.hotelReservationSystem.entities.Reservation;
import com.tobeto.hotelReservationSystem.entities.Room;
import com.tobeto.hotelReservationSystem.entities.enums.ReservationStatus;
import com.tobeto.hotelReservationSystem.repositories.ReservationRepository;
import com.tobeto.hotelReservationSystem.services.abstracts.ReservationService;
import com.tobeto.hotelReservationSystem.services.abstracts.RoomService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.reservation.AddReservationRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.reservation.UpdateReservationRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reservation.*;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.ListRoomResponse;
import com.tobeto.hotelReservationSystem.services.mappers.ReservationMapper;
import com.tobeto.hotelReservationSystem.services.mappers.RoomMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;
    private final RoomService roomService;

        @Override
        public AddReservationResponse add(AddReservationRequest addReservationRequest) {
            Reservation reservation=ReservationMapper.INSTANCE.reservationToAddReservationRequest(addReservationRequest);
            reservation.setReservationStatus(ReservationStatus.PENDING);
            Reservation savedReservation=reservationRepository.save(reservation);
            return ReservationMapper.INSTANCE.addReservationResponseToReservation(savedReservation);
            //TODO: Ücret hesaplanacak
        }

        @Override
        public List<ListReservationResponse> getAll() {
            List<Reservation> reservationList = reservationRepository.findAll();
            List<ListReservationResponse> result = new ArrayList<>();
            for (Reservation reservation : reservationList) {
                ListReservationResponse dto = ReservationMapper.INSTANCE.getAllReservationResponseToReservation(reservation);
                result.add(dto);
            }
            return result;
        }
        @Override
        public GetByIdReservationResponse getById(int id) {
            Optional<Reservation> reservation=reservationRepository.findById(id);
            if(reservation.isPresent()){
                return ReservationMapper.INSTANCE.getByIdReservationResponseToReservation(reservation.get());
            }else{
                return null;
            }
        }

    @Override
    public void reservationStatus(int id, ReservationStatus reservationStatus) {
        Reservation reservation = reservationRepository.findById(id)
                .orElseThrow(() -> new BusinessException("id is not found"));

        //TODO: Reservasyon durumuna göre oda durumunu değiştirmiyor.
        reservation.setReservationStatus(reservationStatus);
        int roomId = reservation.getRoom().getId();
        Room room = roomService.findRoomById(roomId);
        if(reservationStatus.equals(ReservationStatus.CANCELED)){
            room.setAvailable(false);
        }else if(reservationStatus.equals(ReservationStatus.CONFIRMED)){
            room.setAvailable(true);
        }else if(reservationStatus.equals(ReservationStatus.PENDING)){
            room.setAvailable(false);
        }
        reservation.setRoom(room);
        reservationRepository.save(reservation);
    }

    @Override
        public void delete(int id) {
            reservationRepository.deleteById(id);
        }

        @Override
        public UpdateReservationResponse update(UpdateReservationRequest updateReservationRequest) {
            Reservation reservation=ReservationMapper.INSTANCE.reservationToUpdateReservationRequest(updateReservationRequest);
            Reservation updatedReservation=reservationRepository.save(reservation);
            return ReservationMapper.INSTANCE.updateReservationResponseToReservation(updatedReservation);
        }

        @Override
        public List<GetByIdReservationResponse> getReservationsByUserId(int userId) {
            List<Reservation> reservations=reservationRepository.findByUserId(userId);
            if(reservations !=null && !reservations.isEmpty()){
                return ReservationMapper.INSTANCE.getByUserReservationResponseToReservation(reservations);
            }else {
                return null;
            }
        }
}

