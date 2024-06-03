package com.tobeto.hotelReservationSystem.services.abstracts;

import com.tobeto.hotelReservationSystem.services.dtos.requests.AddUserRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.AddUserResponse;

public interface UserService {

    AddUserResponse add(AddUserRequest request);

}
