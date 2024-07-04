package com.tobeto.hotelReservationSystem.services.dtos.requests.district;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetAllByCityIdRequest {

  //Todo:Admin sayfası yok. Bir sonraki süreçte eklenecek.

    private int cityId;
}