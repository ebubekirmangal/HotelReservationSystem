package com.tobeto.hotelReservationSystem.services.dtos.requests.hotel;

import com.tobeto.hotelReservationSystem.entities.enums.HousingType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateHotelRequest {

    private int id;

    private int userId;

    private String name;

    private int addressId;

    private int phoneNumber;

    private String email;

    private HousingType housingType;
}
