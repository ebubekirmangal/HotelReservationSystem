package com.tobeto.hotelReservationSystem.services.dtos.responses.hotel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateHotelResponse {
    private int id;

    private int userId;

//    private String name;
//
//    private String phoneNumber;
//
//    private String email;

    private int addressId;

//    private HousingType housingType;
}
