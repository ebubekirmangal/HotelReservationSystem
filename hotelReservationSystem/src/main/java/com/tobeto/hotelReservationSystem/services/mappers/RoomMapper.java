package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Room;
import com.tobeto.hotelReservationSystem.services.dtos.requests.room.AddRoomRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.room.UpdateRoomRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.AddRoomResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.GetByIdRoomResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.ListRoomResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.UpdateRoomResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RoomMapper {

    RoomMapper INSTANCE = Mappers.getMapper(RoomMapper.class);
    @Mapping(target = "hotel.id", source = "hotelId")
    Room addRoomRequestToRoom(AddRoomRequest request);
    @Mapping(target = "hotel.id", source = "hotelId")
    Room updateRoomRequestToRoom(UpdateRoomRequest request);

    @Mapping(target = "hotelName", source = "hotel.name")
    AddRoomResponse roomToAddRoomResponse(Room room);
    @Mapping(target = "hotelName",source = "hotel.name")
    UpdateRoomResponse roomToUpdateRoomResponse(Room room);
    @Mapping(target = "hotelName", source = "hotel.name")
    GetByIdRoomResponse roomToGetByIdRoomResponse(Room room);
    @Mapping(target = "hotelName", source = "hotel.name")
    List<ListRoomResponse> roomsToGetAllRoomResponses(List<Room> rooms);

}
