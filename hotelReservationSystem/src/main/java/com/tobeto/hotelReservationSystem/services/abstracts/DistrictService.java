package com.tobeto.hotelReservationSystem.services.abstracts;

import com.tobeto.hotelReservationSystem.services.dtos.responses.district.GetAllByCityIdResponse;

import java.util.List;

public interface DistrictService {

    List<GetAllByCityIdResponse> getAllByCityId(int cityId);
}
