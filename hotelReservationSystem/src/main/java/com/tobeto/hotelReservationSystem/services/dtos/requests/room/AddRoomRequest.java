package com.tobeto.hotelReservationSystem.services.dtos.requests.room;

import com.tobeto.hotelReservationSystem.entities.enums.RoomType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddRoomRequest {

    private String title;

    private List<String> imageData;

    private double price;

    private RoomType roomType;

    private List<String> features;

    private int hotelId;
}
