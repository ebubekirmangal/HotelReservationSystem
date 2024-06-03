package com.tobeto.hotelReservationSystem.services.concretes;

import com.tobeto.hotelReservationSystem.services.abstracts.ReservationService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.reservation.AddReservationRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.reservation.UpdateReservationRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reservation.AddReservationResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reservation.GetByIdReservationResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reservation.ListReservationResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reservation.UpdateReservationResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {
    @Override
    public AddReservationResponse add(AddReservationRequest request) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public UpdateReservationResponse update(UpdateReservationRequest request) {
        return null;
    }

    @Override
    public List<ListReservationResponse> getAll() {
        return null;
    }

    @Override
    public GetByIdReservationResponse getById(int id) {
        return null;
    }
}
