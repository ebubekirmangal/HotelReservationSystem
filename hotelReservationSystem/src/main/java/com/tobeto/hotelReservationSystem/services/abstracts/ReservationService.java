package com.tobeto.hotelReservationSystem.services.abstracts;

import com.tobeto.hotelReservationSystem.entities.enums.ReservationStatus;
import com.tobeto.hotelReservationSystem.services.dtos.requests.reservation.AddReservationRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.reservation.UpdateReservationRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reservation.*;

import java.util.List;

public interface ReservationService {

    AddReservationResponse add (AddReservationRequest request);

    void delete (int id);

    UpdateReservationResponse update(UpdateReservationRequest request);

    List<ListReservationResponse> getAll();

    GetByIdReservationResponse getById(int id);

    void reservationStatus(int id, ReservationStatus status);

    List<GetByIdReservationResponse> getReservationsByUserId(int userId);
}
