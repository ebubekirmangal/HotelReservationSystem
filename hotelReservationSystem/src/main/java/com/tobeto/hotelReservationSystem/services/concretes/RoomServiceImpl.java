package com.tobeto.hotelReservationSystem.services.concretes;

import com.tobeto.hotelReservationSystem.services.abstracts.RoomService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.room.AddRoomRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.room.UpdateRoomRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.AddRoomResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.GetByIdRoomResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.ListRoomResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.UpdateRoomResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    @Override
    public AddRoomResponse add(AddRoomRequest request) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public UpdateRoomResponse update(UpdateRoomRequest request) {
        return null;
    }

    @Override
    public List<ListRoomResponse> getAll() {
        return null;
    }

    @Override
    public GetByIdRoomResponse getById(int id) {
        return null;
    }
}
