package com.tobeto.hotelReservationSystem.services.concretes;

import com.tobeto.hotelReservationSystem.entities.addresses.City;
import com.tobeto.hotelReservationSystem.repositories.CityRepository;
import com.tobeto.hotelReservationSystem.services.abstracts.CityService;
import com.tobeto.hotelReservationSystem.services.dtos.responses.city.GetAllCityResponse;
import com.tobeto.hotelReservationSystem.services.mappers.CityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;
    @Override
    public List<GetAllCityResponse> getAll() {
        List<City> cities = cityRepository.findAll();
        List<GetAllCityResponse> result = new ArrayList<>();

        for (City city:cities){
            GetAllCityResponse dto = CityMapper.INSTANCE.CityToGetAllCityResponse(city);
            result.add(dto);
        }
        return result;
    }
}