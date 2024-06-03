package com.tobeto.hotelReservationSystem.services.abstracts;

import com.tobeto.hotelReservationSystem.services.dtos.requests.hotel.AddHotelRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.hotel.UpdateHotelRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.AddHotelResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.GetByIdHotelResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.ListHotelResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.UpdateHotelResponse;

import java.util.List;

public interface HotelService {
    AddHotelResponse add (AddHotelRequest request);

    void delete (int id);

    UpdateHotelResponse update(UpdateHotelRequest request);

    List<ListHotelResponse> getAll();

    GetByIdHotelResponse getById(int id);
}
