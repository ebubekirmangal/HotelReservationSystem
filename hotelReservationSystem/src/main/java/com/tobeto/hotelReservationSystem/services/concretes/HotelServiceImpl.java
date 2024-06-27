package com.tobeto.hotelReservationSystem.services.concretes;

import com.tobeto.hotelReservationSystem.core.utils.exceptions.types.BusinessException;
import com.tobeto.hotelReservationSystem.entities.Hotel;
import com.tobeto.hotelReservationSystem.repositories.HotelRepository;
import com.tobeto.hotelReservationSystem.services.abstracts.HotelService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.hotel.AddHotelRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.hotel.UpdateHotelRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.*;
import com.tobeto.hotelReservationSystem.services.mappers.HotelMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;

    @Override
    public List<ListHotelResponse> getAll() {
        List<Hotel> hotelList = hotelRepository.findAll();
        List<ListHotelResponse> result = new ArrayList<>();
        for (Hotel hotel : hotelList) {
            ListHotelResponse dto = HotelMapper.INSTANCE.ListHotelResponseToHotel(hotel);
            result.add(dto);
        }
        return result;
    }

    @Override
    public GetByIdHotelResponse getById(int id) {
        Optional<Hotel> hotel = hotelRepository.findById(id);
        return hotel.map(HotelMapper.INSTANCE::getByIdHotelResponseToHotel).orElse(null);
    }

    @Override
    public List<HotelDetailsResponse> findHotelsByCityAndDates(String city, LocalDate checkInDate, LocalDate checkOutDate) {
        return hotelRepository.findHotelsByCityAndDates(city, checkInDate, checkOutDate);
    }

    @Override
    public AddHotelResponse add(AddHotelRequest request) {
        Hotel hotel = HotelMapper.INSTANCE.hotelToAddHotelRequest(request);

        Hotel Saved = hotelRepository.save(hotel);

        AddHotelResponse response = HotelMapper.INSTANCE.addHotelResponseToHotel(Saved);
        return response;
    }

    @Override
    public void delete(int id) {
        Hotel findById = hotelRepository.findById(id).orElseThrow(()-> new BusinessException("id is not found"));
        hotelRepository.delete(findById);
    }

    @Override
    public UpdateHotelResponse update(UpdateHotelRequest request) {
        Hotel hotel = HotelMapper.INSTANCE.hotelToUpdateHotelRequest(request);
        Hotel Updated = hotelRepository.save(hotel);
        UpdateHotelResponse response = HotelMapper.INSTANCE.updateHotelResponseToHotel(Updated);
        return response;
    }
//    @Override
//    public List<ListHotelRoomResponse> findHotelsWithPriceAndRating(Double price, Integer rating) {
//        return hotelRepository.findHotelsWithPriceAndRating(price, rating);
//    }
}
