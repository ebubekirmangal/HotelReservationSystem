package com.tobeto.hotelReservationSystem.services.dtos.responses.room;

import com.tobeto.hotelReservationSystem.entities.enums.RoomType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateRoomResponse {

    private int id;

    private RoomType roomType;

    private String roomNumber;

    private int capacity;

    private double price;

    private  boolean availability;

    private String hotelName;
}
