package com.tobeto.hotelReservationSystem.services.concretes;

import com.tobeto.hotelReservationSystem.core.utils.exceptions.types.BusinessException;
import com.tobeto.hotelReservationSystem.entities.Room;
import com.tobeto.hotelReservationSystem.repositories.RoomRepository;
import com.tobeto.hotelReservationSystem.services.abstracts.RoomService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.room.AddRoomRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.room.UpdateRoomRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.AddRoomResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.GetByIdRoomResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.ListRoomResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.UpdateRoomResponse;
import com.tobeto.hotelReservationSystem.services.mappers.RoomMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;

    @Override
    public AddRoomResponse add(AddRoomRequest request) {
        Room room = RoomMapper.INSTANCE.addRoomRequestToRoom(request);
        Room saved = roomRepository.save(room);
        AddRoomResponse response = RoomMapper.INSTANCE.roomToAddRoomResponse(saved);
        return response;
    }

    @Override
    public UpdateRoomResponse update(UpdateRoomRequest request) {
        Room room = RoomMapper.INSTANCE.updateRoomRequestToRoom(request);
        Room updated = roomRepository.save(room);
        UpdateRoomResponse response = RoomMapper.INSTANCE.roomToUpdateRoomResponse(updated);
        return response;
    }

    @Override
    public void delete(int id) {
        Room room = roomRepository.findById(id)
                .orElseThrow(() -> new BusinessException("Room not found"));
        roomRepository.deleteById(id);
    }

    @Override
    public List<ListRoomResponse> getAll() {

        List<Room> rooms = roomRepository.findAll();
        return RoomMapper.INSTANCE.roomsToGetAllRoomResponses(rooms);
    }

    @Override
    public GetByIdRoomResponse getById(int id) {

        Room room = roomRepository.findById(id).orElseThrow();


        return null;
    }
}
