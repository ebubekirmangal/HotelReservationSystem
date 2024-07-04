package com.tobeto.hotelReservationSystem.services.dtos.responses.address;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ListAddressResponse {

    private int id;

    private int hotelId;

    private int districtId;



}
