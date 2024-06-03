package com.tobeto.hotelReservationSystem.services.dtos.responses.reservation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateReservationResponse {

    private LocalDate checkInDate;

    private LocalDate checkOutDate;

    private int roomId;

    private int userId;

    private int hotelId;
}
