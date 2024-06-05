package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Hotel;
import com.tobeto.hotelReservationSystem.entities.Reservation;
import com.tobeto.hotelReservationSystem.entities.User;
import com.tobeto.hotelReservationSystem.services.dtos.requests.hotel.AddHotelRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.hotel.UpdateHotelRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.AddHotelResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.GetByIdHotelResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.ListHotelResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.UpdateHotelResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface HotelMapper {

    HotelMapper INSTANCE = Mappers.getMapper(HotelMapper.class);

    //@Mapping(target = "reservations",source = "userId")
    Hotel hotelToAddHotelRequest(AddHotelRequest request);
    //@Mapping(target = "reservations",source = "userId")
    Hotel hotelToUpdateHotelRequest(UpdateHotelRequest request);
    //@Mapping(target="userId",source = "reservations")
    AddHotelResponse addHotelResponseToHotel(Hotel hotel);
   // @Mapping(target="userId",source = "reservations")
    UpdateHotelResponse updateHotelResponseToHotel(Hotel hotel);
   // @Mapping(target="userId",source = "reservations")
    ListHotelResponse ListHotelResponseToHotel(Hotel hotel);
   // @Mapping(target="userId",source = "reservations")
    GetByIdHotelResponse getByIdHotelResponseToHotel(Hotel hotel);
/*
    default List<User> mapReservationsToHotels(List<Reservation> reservations) {
        return reservations.stream()
                .map(Reservation::getHotel::getUser()::getId())
                .collect(Collectors.toList());
    }

 */
}
