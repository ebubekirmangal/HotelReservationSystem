package com.tobeto.hotelReservationSystem.services.abstracts;

import com.tobeto.hotelReservationSystem.services.dtos.requests.reservation.AddReservationRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.reservation.UpdateReservationRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reservation.AddReservationResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reservation.GetByIdReservationResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reservation.ListReservationResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reservation.UpdateReservationResponse;

import java.util.List;

public interface ReservationService {

    AddReservationResponse add (AddReservationRequest request);

    void delete (int id);

    UpdateReservationResponse update(UpdateReservationRequest request);

    List<ListReservationResponse> getAll();

    GetByIdReservationResponse getById(int id);
}
