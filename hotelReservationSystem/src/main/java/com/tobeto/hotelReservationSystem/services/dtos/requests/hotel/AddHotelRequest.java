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
public class AddHotelRequest {

    private int userId;

    private String name;

    private int phoneNumber;

    private String email;

    private int addressId;  //TODO:Bunun doğruluğundan emin değilim..

    private HousingType housingType;

}
