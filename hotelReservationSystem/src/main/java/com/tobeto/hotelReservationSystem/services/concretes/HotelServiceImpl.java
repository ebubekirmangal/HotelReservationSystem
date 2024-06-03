package com.tobeto.hotelReservationSystem.services.concretes;

import com.tobeto.hotelReservationSystem.services.abstracts.HotelService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.hotel.AddHotelRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.hotel.UpdateHotelRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.AddHotelResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.GetByIdHotelResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.ListHotelResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.UpdateHotelResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {
    @Override
    public AddHotelResponse add(AddHotelRequest request) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public UpdateHotelResponse update(UpdateHotelRequest request) {
        return null;
    }

    @Override
    public List<ListHotelResponse> getAll() {
        return null;
    }

    @Override
    public GetByIdHotelResponse getById(int id) {
        return null;
    }
}
