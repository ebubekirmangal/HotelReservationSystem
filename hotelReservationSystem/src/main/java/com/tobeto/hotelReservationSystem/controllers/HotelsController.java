package com.tobeto.hotelReservationSystem.controllers;

import com.tobeto.hotelReservationSystem.services.abstracts.HotelService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.hotel.AddHotelRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.hotel.UpdateHotelRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.AddHotelResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.GetByIdHotelResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.ListHotelResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.UpdateHotelResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/hotel")
public class HotelsController {

    private final HotelService hotelService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public AddHotelResponse add(@RequestBody AddHotelRequest request){
        return hotelService.add(request);
    }
    @PutMapping("/update")
    public UpdateHotelResponse update(@RequestBody UpdateHotelRequest request){
        return hotelService.update(request);
    }
    @DeleteMapping ("/delete/{id}")
    public void delete(@PathVariable("id") int id){
        hotelService.delete(id);
    }
    @GetMapping ("/getAll")
    public List<ListHotelResponse> getAll(){
        return hotelService.getAll();
    }
    @GetMapping ("/getById/{id}")
    public GetByIdHotelResponse getById(@PathVariable("id") int id){
        return hotelService.getById(id);
    }
}
