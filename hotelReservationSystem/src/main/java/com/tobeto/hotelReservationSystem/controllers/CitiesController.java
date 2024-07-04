package com.tobeto.hotelReservationSystem.controllers;


import com.tobeto.hotelReservationSystem.services.abstracts.CityService;
import com.tobeto.hotelReservationSystem.services.dtos.responses.city.GetAllCityResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cities")
@RequiredArgsConstructor
public class CitiesController {

    private final CityService cityService;
    @GetMapping("/getAll")
    public List<GetAllCityResponse> getAll(){
        return cityService.getAll();
    }
}
