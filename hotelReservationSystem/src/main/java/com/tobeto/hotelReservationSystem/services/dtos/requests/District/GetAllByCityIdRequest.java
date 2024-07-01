package com.tobeto.hotelReservationSystem.services.dtos.requests.District;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetAllByCityIdRequest {

    private int cityId;
}
