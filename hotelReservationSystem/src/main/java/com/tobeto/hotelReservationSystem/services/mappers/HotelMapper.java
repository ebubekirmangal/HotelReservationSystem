package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Hotel;
import com.tobeto.hotelReservationSystem.services.dtos.requests.hotel.AddHotelRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.hotel.UpdateHotelRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.AddHotelResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.GetByIdHotelResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.ListHotelResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.UpdateHotelResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HotelMapper {

    HotelMapper INSTANCE = Mappers.getMapper(HotelMapper.class);

    Hotel hotelToAddHotelRequest(AddHotelRequest request);

    AddHotelResponse addHotelResponseToHotel(Hotel hotel);

    Hotel hotelToUpdateHotelRequest(UpdateHotelRequest request);

    UpdateHotelResponse updateHotelResponseToHotel(Hotel hotel);

    ListHotelResponse ListHotelResponseToHotel(Hotel hotel);

    GetByIdHotelResponse getByIdHotelResponseToHotel(Hotel hotel);
}
