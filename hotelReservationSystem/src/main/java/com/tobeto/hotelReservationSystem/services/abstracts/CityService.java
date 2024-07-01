package com.tobeto.hotelReservationSystem.services.abstracts;

import com.tobeto.hotelReservationSystem.services.dtos.responses.city.GetAllCityResponse;

import java.util.List;

public interface CityService {

    List<GetAllCityResponse> getAll();
}
