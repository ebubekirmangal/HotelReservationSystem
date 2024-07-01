package com.tobeto.hotelReservationSystem.services.abstracts;

import com.tobeto.hotelReservationSystem.services.dtos.requests.District.GetAllByCityIdRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.District.GetAllByCityIdResponse;

import java.util.List;

public interface DistrictService {

    List<GetAllByCityIdResponse> getAllByCityId(int cityId);
}
