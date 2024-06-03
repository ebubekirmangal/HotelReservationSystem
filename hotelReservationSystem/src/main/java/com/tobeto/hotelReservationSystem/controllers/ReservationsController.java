package com.tobeto.hotelReservationSystem.controllers;

import com.tobeto.hotelReservationSystem.entities.Reservation;
import com.tobeto.hotelReservationSystem.services.abstracts.ReservationService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.reservation.AddReservationRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.reservation.UpdateReservationRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reservation.AddReservationResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reservation.GetByIdReservationResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reservation.ListReservationResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reservation.UpdateReservationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/reservation")
public class ReservationsController {

    private final ReservationService reservationService;

    @PostMapping("/add")
    public AddReservationResponse add(@RequestBody AddReservationRequest request) {
        return reservationService.add(request);
    }

    @PutMapping("/update")
    public UpdateReservationResponse update(@RequestBody UpdateReservationRequest request) {
        return reservationService.update(request);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        reservationService.delete(id);
    }

    @GetMapping("/getAll")
    public List<ListReservationResponse> getAll()
    {
        return reservationService.getAll();
    }

    @GetMapping("/getById/{id}")
    public GetByIdReservationResponse getById(@PathVariable("id") int id)
    {
        return reservationService.getById(id);
    }

    @PostMapping("/getByIdForGuest/{id}")
    public List<GetByIdReservationResponse> getReservationsByUserId(@PathVariable("id") int id){
        return reservationService.getReservationsByUserId(id);
    }

}
