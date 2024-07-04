package com.tobeto.hotelReservationSystem.services.dtos.requests.address;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddAddressRequest {

    private String description;

    private int hotelId;

    private int districtId;

}

//TODO:hotelId eklenebilir?
