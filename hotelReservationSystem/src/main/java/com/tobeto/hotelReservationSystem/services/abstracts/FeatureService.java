package com.tobeto.hotelReservationSystem.services.abstracts;

import com.tobeto.hotelReservationSystem.services.dtos.responses.feature.GetAllFeatureForRoomResponse;

import java.util.List;

public interface FeatureService {

    List<GetAllFeatureForRoomResponse> getAll(int HotelId, int RoomId);

   // List<GetAllFeatureForHotelResponse> getAll();
}
