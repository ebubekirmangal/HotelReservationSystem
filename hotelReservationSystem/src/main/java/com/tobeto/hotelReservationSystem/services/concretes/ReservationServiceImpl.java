package com.tobeto.hotelReservationSystem.services.concretes;

import com.tobeto.hotelReservationSystem.core.utils.exceptions.types.BusinessException;
import com.tobeto.hotelReservationSystem.entities.Reservation;
import com.tobeto.hotelReservationSystem.entities.enums.ReservationStatus;
import com.tobeto.hotelReservationSystem.repositories.ReservationRepository;
import com.tobeto.hotelReservationSystem.services.abstracts.ReservationService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.reservation.AddReservationRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.reservation.UpdateReservationRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reservation.*;
import com.tobeto.hotelReservationSystem.services.mappers.ReservationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;
    private ReservationMapper reservationMapper;



        @Override
        public AddReservationResponse add(AddReservationRequest addReservationRequest) {
            Reservation reservation=reservationMapper.reservationToAddReservationRequest(addReservationRequest);
            reservation.setReservationStatus(ReservationStatus.PENDING);
            Reservation savedReservation=reservationRepository.save(reservation);
            return reservationMapper.addReservationResponseToReservation(savedReservation);
        }

        @Override
        public List<ListReservationResponse> getAll() {
            List<Reservation> reservations=reservationRepository.findAll();
            return ReservationMapper.INSTANCE.getAllReservationResponseToReservation(reservations);
        }
        @Override
        public GetByIdReservationResponse getById(int id) {
            Optional<Reservation> reservation=reservationRepository.findById(id);
            if(reservation.isPresent()){
                return reservationMapper.getByIdReservationResponseToReservation(reservation.get());
            }else{
                return null;
            }
        }

    @Override
    public void reservationStatus(int id, ReservationStatus reservationStatus) {
        Reservation reservation = reservationRepository.findById(id)
                .orElseThrow(() -> new BusinessException("id is not found"));

        reservation.setReservationStatus(reservationStatus);
        reservationRepository.save(reservation);
    }

    @Override
        public void delete(int id) {
            reservationRepository.deleteById(id);
        }

        @Override
        public UpdateReservationResponse update(UpdateReservationRequest updateReservationRequest) {
            Reservation reservation=reservationMapper.reservationToUpdateReservationRequest(updateReservationRequest);
            Reservation updatedReservation=reservationRepository.save(reservation);
            return reservationMapper.updateReservationResponseToReservation(updatedReservation);
        }

        @Override
        public List<GetByIdReservationResponse> getReservationsByUserId(int userId) {
            List<Reservation> reservations=reservationRepository.findByUserId(userId);
            if(reservations !=null && !reservations.isEmpty()){
                return reservationMapper.getByUserReservationResponseToReservation(reservations);
            }else {
                return null;
            }
        }

//        @Override
//        public void approveReservation(int id) {
//            reservationRepository.findById(id).ifPresent(reservation -> {reservation.setStatus(ReservationStatus.CONFIRMED);
//                reservationRepository.save(reservation);
//            });
//        }
//
//        @Override
//        public void cancelReservation(int id) {
//            reservationRepository.findById(id).ifPresent(reservation -> {reservation.setStatus(ReservationStatus.CANCELED);
//                reservationRepository.save(reservation);
//            });
//        }

}

