package com.tobeto.hotelReservationSystem.services.dtos.requests.room;

import com.tobeto.hotelReservationSystem.entities.Feature;
import com.tobeto.hotelReservationSystem.entities.Image;
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

    private List<Image> imageIds;

    private List<Feature> featureIds;

    private RoomType roomType;

    private int capacity;

    private double price;

    private int hotelId;

    //TODO:addressId eklenecek
}
