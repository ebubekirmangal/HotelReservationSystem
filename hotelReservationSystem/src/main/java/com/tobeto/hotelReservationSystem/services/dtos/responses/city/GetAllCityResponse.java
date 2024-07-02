package com.tobeto.hotelReservationSystem.services.dtos.responses.city;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetAllCityResponse {

    private int id;

    private String name;
}
