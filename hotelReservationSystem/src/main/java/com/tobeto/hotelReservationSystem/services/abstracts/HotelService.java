package com.tobeto.hotelReservationSystem.services.abstracts;

import com.tobeto.hotelReservationSystem.entities.Hotel;
import com.tobeto.hotelReservationSystem.services.dtos.requests.hotel.AddHotelRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.hotel.UpdateHotelRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.*;

import java.time.LocalDate;
import java.util.List;

public interface HotelService {
    AddHotelResponse add (AddHotelRequest request);

    void delete (int id);

    UpdateHotelResponse update(UpdateHotelRequest request);

    List<ListHotelResponse> getAll();

    GetByIdHotelResponse getById(int id);

//    List<HotelDetailsResponse> findHotelsByCityAndDates(String city, LocalDate checkInDate, LocalDate checkOutDate);

//    List<ListHotelRoomResponse> findHotelsWithPriceAndRating(Double price, Integer rating);
}
