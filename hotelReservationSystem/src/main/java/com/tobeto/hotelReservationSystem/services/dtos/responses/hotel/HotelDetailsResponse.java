package com.tobeto.hotelReservationSystem.services.dtos.responses.hotel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor

public class HotelDetailsResponse {
    private String hotelName;
    private String city;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    public HotelDetailsResponse(String hotelName, String city, LocalDate checkInDate, LocalDate checkOutDate) {
        this.hotelName = hotelName;
        this.city = city;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }
}
