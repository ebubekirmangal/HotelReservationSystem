package com.tobeto.hotelReservationSystem.services.abstracts;

import com.tobeto.hotelReservationSystem.entities.Room;
import com.tobeto.hotelReservationSystem.entities.enums.RoomType;
import com.tobeto.hotelReservationSystem.services.dtos.requests.room.AddRoomRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.room.UpdateRoomRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.AddRoomResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.GetByIdRoomResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.ListRoomResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.UpdateRoomResponse;

import java.time.LocalDate;
import java.util.List;

public interface RoomService {

    AddRoomResponse add (AddRoomRequest request);

    void delete (int id);

    UpdateRoomResponse update(UpdateRoomRequest request);

    List<ListRoomResponse> getAll();

    GetByIdRoomResponse getById(int id);
    List<ListRoomResponse> findAvailableRooms(LocalDate startDate, LocalDate endDate, RoomType roomType);
    Room findRoomById(int id);
    void updateAvaible(Room room,boolean avaible);
}