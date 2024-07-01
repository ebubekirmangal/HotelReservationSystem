package com.tobeto.hotelReservationSystem.services.dtos.responses.District;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetAllByCityIdResponse {

    private int id;

    private String name;
}
