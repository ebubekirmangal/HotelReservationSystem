package com.tobeto.hotelReservationSystem.controllers;

import com.tobeto.hotelReservationSystem.services.abstracts.DistrictService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.District.GetAllByCityIdRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.District.GetAllByCityIdResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/districts")
@RequiredArgsConstructor
public class DistrictsController {

    private final DistrictService districtService;

    @GetMapping("/getAllByCityId/{cityId}")
    public List<GetAllByCityIdResponse> getAllByCityId(@PathVariable int cityId){
        return districtService.getAllByCityId(cityId);
    }
}
