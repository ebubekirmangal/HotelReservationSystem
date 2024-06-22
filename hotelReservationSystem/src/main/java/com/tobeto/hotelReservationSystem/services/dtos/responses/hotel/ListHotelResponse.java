package com.tobeto.hotelReservationSystem.services.dtos.responses.hotel;

import com.tobeto.hotelReservationSystem.entities.enums.HousingType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ListHotelResponse {

    private int id;

    private int userId;

    private String name;

    private int phoneNumber;

    private String email;

    private HousingType housingType;

    private int addressId;
}
