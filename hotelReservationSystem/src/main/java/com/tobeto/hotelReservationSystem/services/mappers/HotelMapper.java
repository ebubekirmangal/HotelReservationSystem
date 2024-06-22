package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Hotel;
import com.tobeto.hotelReservationSystem.entities.Reservation;
import com.tobeto.hotelReservationSystem.entities.Room;
import com.tobeto.hotelReservationSystem.entities.User;
import com.tobeto.hotelReservationSystem.services.dtos.requests.hotel.AddHotelRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.hotel.UpdateHotelRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.*;
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
    @Mapping(target = "address.id", source = "addressId")
    Hotel hotelToAddHotelRequest(AddHotelRequest request);
    //@Mapping(target = "reservations",source = "userId")
    @Mapping(target = "address.id", source = "addressId")
    Hotel hotelToUpdateHotelRequest(UpdateHotelRequest request);
    //@Mapping(target="userId",source = "reservations")
    @Mapping(target = "addressId", source = "address.id")
    AddHotelResponse addHotelResponseToHotel(Hotel hotel);
   // @Mapping(target="userId",source = "reservations")
    @Mapping(target = "addressId", source = "address.id")
    UpdateHotelResponse updateHotelResponseToHotel(Hotel hotel);
   // @Mapping(target="userId",source = "reservations")
    @Mapping(target = "addressId", source = "address.id")
    ListHotelResponse ListHotelResponseToHotel(Hotel hotel);
   // @Mapping(target="userId",source = "reservations")
    @Mapping(target = "addressId", source = "address.id")
    GetByIdHotelResponse getByIdHotelResponseToHotel(Hotel hotel);
    @Mapping(target = "roomPrice", source = "room.price")
    ListHotelRoomResponse ListHotelRoomResponseToHotel(Hotel hotel); //TODO:list mapleme yapılmalı

/*
    default List<User> mapReservationsToHotels(List<Reservation> reservations) {
        return reservations.stream()
                .map(Reservation::getHotel::getUser()::getId())
                .collect(Collectors.toList());
    }

 */
}
