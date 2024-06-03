package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Reservation;
import com.tobeto.hotelReservationSystem.services.dtos.requests.reservation.AddReservationRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.reservation.UpdateReservationRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reservation.AddReservationResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reservation.GetByIdReservationResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reservation.ListReservationResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reservation.UpdateReservationResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ReservationMapper {

    ReservationMapper INSTANCE = Mappers.getMapper(ReservationMapper.class);

    @Mapping(target = "hotel.id",source = "hotelId")
    @Mapping(target = "user.id",source = "userId")
    @Mapping(target = "room.id",source = "roomId")
    Reservation reservationToAddReservationRequest(AddReservationRequest addReservationRequest);
    @Mapping(target = "hotelId",source = "hotel.id")
    @Mapping(target = "userId",source = "user.id")
    @Mapping(target = "roomId",source = "room.id")
    AddReservationResponse addReservationResponseToReservation(Reservation reservation);
    @Mapping(target = "hotel.id",source = "hotelId")
    @Mapping(target = "user.id",source = "userId")
    @Mapping(target = "room.id",source = "roomId")
    Reservation reservationToUpdateReservationRequest(UpdateReservationRequest updateReservationRequest);
    @Mapping(target = "hotelId",source = "hotel.id")
    @Mapping(target = "userId",source = "user.id")
    @Mapping(target = "roomId",source = "room.id")
    UpdateReservationResponse updateReservationResponseToReservation(Reservation reservation);
    @Mapping(target = "roomId", source = "room.id")
    @Mapping(target = "roomType", source = "room.roomType")
    @Mapping(target = "userId", source= "user.id")
    @Mapping(target = "hotelId", source = "hotel.id")
    List<ListReservationResponse> getAllReservationResponseToReservation(List<Reservation> reservations);
    @Mapping(target = "roomId", source = "room.id")
    @Mapping(target = "roomType", source = "room.roomType")
    @Mapping(target = "userId", source= "user.id")
    @Mapping(target = "hotelId", source = "hotel.id")
    GetByIdReservationResponse getByIdReservationResponseToReservation(Reservation reservation);
    @Mapping(target = "roomId", source = "room.id")
    @Mapping(target = "roomType", source = "room.roomType")
    @Mapping(target = "userId", source= "user.id")
    @Mapping(target = "hotelId", source = "hotel.id")
    List<GetByIdReservationResponse> getByUserReservationResponseToReservation(List<Reservation> reservations);
}
