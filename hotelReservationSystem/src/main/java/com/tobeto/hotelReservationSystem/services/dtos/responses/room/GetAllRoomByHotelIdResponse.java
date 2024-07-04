package com.tobeto.hotelReservationSystem.services.dtos.responses.room;

import com.tobeto.hotelReservationSystem.entities.enums.RoomType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetAllRoomByHotelIdResponse {
    private int id;

    private RoomType roomType;

    private String roomNumber;

    private int capacity;

    private String title;

    private double price;

   private  boolean available;

    private String featuresIds;

    private String hotelName;
}
