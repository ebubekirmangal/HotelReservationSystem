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
public class AddHotelRequest {

    private String name;

    private int addressId;

    private String email;

    private List<Integer> imageIds;

    private List<Integer> featureIds;

    private int userId;

    private int star;

    private String phone;

    private AccommodationType accommodationType;

   // private int rating;

  //  private List<Integer> roomId;

}
