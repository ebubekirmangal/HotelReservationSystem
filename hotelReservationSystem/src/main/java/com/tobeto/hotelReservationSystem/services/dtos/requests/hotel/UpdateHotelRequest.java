package com.tobeto.hotelReservationSystem.services.dtos.requests.hotel;

import com.tobeto.hotelReservationSystem.entities.enums.AccommodationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateHotelRequest {
    private int id;

    private int userId;

    private String name;

    private int star;

    private double rating;

    private List<Integer> imageIds;

    private String phone;

    private String email;

    private int addressId;

    private AccommodationType accommodationType;

    // private int rating;

    private List<Integer> featureIds;

    //  private List<Integer> roomId;
}
