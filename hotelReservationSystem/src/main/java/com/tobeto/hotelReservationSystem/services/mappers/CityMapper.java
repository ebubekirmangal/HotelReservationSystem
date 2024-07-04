package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.addresses.City;
import com.tobeto.hotelReservationSystem.services.dtos.responses.city.GetAllCityResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CityMapper {

    CityMapper INSTANCE = Mappers.getMapper(CityMapper.class);

    GetAllCityResponse CityToGetAllCityResponse(City city);
}