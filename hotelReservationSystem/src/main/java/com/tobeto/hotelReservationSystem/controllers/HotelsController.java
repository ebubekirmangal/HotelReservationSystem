package com.tobeto.hotelReservationSystem.controllers;

import com.tobeto.hotelReservationSystem.services.abstracts.HotelService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.hotel.AddHotelRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.hotel.UpdateHotelRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/hotel")
public class HotelsController {

    private final HotelService hotelService;

    @PostMapping("/manager/add")
    @ResponseStatus(HttpStatus.CREATED)
    public AddHotelResponse add(@RequestBody AddHotelRequest request){
        return hotelService.add(request);
    }
    @PutMapping("/manager/update")
    public UpdateHotelResponse update(@RequestBody UpdateHotelRequest request){
        return hotelService.update(request);
    }
    @DeleteMapping ("/manager/delete/{id}")
    public void delete(@PathVariable("id") int id){
        hotelService.delete(id);
    }
    @GetMapping ("/manager/getAll")
    public List<ListHotelResponse> getAll(){
        return hotelService.getAll();
    }
    @GetMapping ("/manager/getById/{id}")
    public GetByIdHotelResponse getById(@PathVariable("id") int id){
        return hotelService.getById(id);
    }
//    @GetMapping("/search")
////    public List<ListHotelRoomResponse> searchHotels(@RequestParam Double price, @RequestParam Integer rating){
////        return hotelService. findHotelsWithPriceAndRating(price,rating);
////    }
//@GetMapping("/search-hotels")
//public List<HotelDetailsResponse> searchHotels(@RequestParam String city, @RequestParam LocalDate checkInDate, @RequestParam LocalDate checkOutDate) {
//    return hotelService.findHotelsByCityAndDates(city, checkInDate, checkOutDate);
//}


}
