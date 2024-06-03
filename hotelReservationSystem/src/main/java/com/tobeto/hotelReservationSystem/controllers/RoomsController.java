package com.tobeto.hotelReservationSystem.controllers;

import com.tobeto.hotelReservationSystem.entities.Room;
import com.tobeto.hotelReservationSystem.services.abstracts.RoomService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.room.AddRoomRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.room.UpdateRoomRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.AddRoomResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.GetByIdRoomResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.ListRoomResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.UpdateRoomResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/room")
public class RoomsController {

    private final RoomService roomService;

    @PostMapping("/add")
    public AddRoomResponse add(@RequestBody AddRoomRequest request) {
        return roomService.add(request);
    }

    @PutMapping("/update")
    public UpdateRoomResponse update(@RequestBody UpdateRoomRequest request) {
        return roomService.update(request);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id) {
         roomService.delete(id);
    }

    @GetMapping("/getAll")
    public List<ListRoomResponse> getAll()
    {
        return roomService.getAll();
    }

    @GetMapping("/getById/{id}")
    public GetByIdRoomResponse getById(@PathVariable int id)
    {
        return roomService.getById(id);
    }

}
