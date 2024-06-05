package com.tobeto.hotelReservationSystem.services.dtos.requests.room;

import com.tobeto.hotelReservationSystem.entities.enums.RoomType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateRoomRequest {

    private int id;

    private RoomType roomType;
    private String roomNumber;
    private int capacity;

    private double price;

    private boolean available;

    private int hotelId;
}
