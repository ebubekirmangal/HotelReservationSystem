package com.tobeto.hotelReservationSystem.services.dtos.requests.reservation;

import com.tobeto.hotelReservationSystem.entities.enums.ReservationStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateReservationRequest {

    private int id;

    private LocalDate checkInDate;

    private LocalDate checkOutDate;

    private int roomId;

    private int userId;

    private int hotelId;

    private ReservationStatus reservationStatus;
}
