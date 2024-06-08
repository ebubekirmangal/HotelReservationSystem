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
import com.tobeto.hotelReservationSystem.services.dtos.responses.reservation.AddReservationResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reservation.GetByIdReservationResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reservation.ListReservationResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reservation.UpdateReservationResponse;
import com.tobeto.hotelReservationSystem.services.mappers.ReservationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.temporal.ChronoUnit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;
    private final RoomService roomService;

        @Override
        public AddReservationResponse add(AddReservationRequest request) {
            Reservation reservation=ReservationMapper.INSTANCE.reservationToAddReservationRequest(request);
            reservation.setReservationStatus(ReservationStatus.PENDING);

            int roomId = request.getRoomId();
            Room room = roomService.findRoomById(roomId);

            LocalDate checkInDate = request.getCheckInDate();
            LocalDate checkOutDate = request.getCheckOutDate();

            double day = ChronoUnit.DAYS.between(checkInDate, checkOutDate);
            reservation.setTotalPrice(room.getPrice()*day);

            Reservation savedReservation=reservationRepository.save(reservation);
            AddReservationResponse response= ReservationMapper.INSTANCE.addReservationResponseToReservation(savedReservation);
            reservationStatus(response.getId(),response.getReservationStatus() );
            return response;

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
            room.setAvailable(true);
        }else if(reservationStatus.equals(ReservationStatus.CONFIRMED)){
            room.setAvailable(false);
        }else if(reservationStatus.equals(ReservationStatus.PENDING)){
            room.setAvailable(false);
        }
        roomService.updateAvaible(room,room.getAvailable());

        System.out.println("Oda ID: " + room.getId() + ", Müsaitlik Durumu: " + room.getAvailable());
        reservationRepository.save(reservation);
    }

    @Override
        public void delete(int id) {
            reservationRepository.deleteById(id);
        }

        @Override
        public UpdateReservationResponse update(UpdateReservationRequest request) {
            Reservation reservation=ReservationMapper.INSTANCE.reservationToUpdateReservationRequest(request);
            Reservation updatedReservation=reservationRepository.save(reservation);
            UpdateReservationResponse response = ReservationMapper.INSTANCE.updateReservationResponseToReservation(updatedReservation);
            reservationStatus(request.getId(),request.getReservationStatus() );
            return response;
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

