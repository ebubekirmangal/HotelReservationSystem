package com.tobeto.hotelReservationSystem.services.abstracts;

import com.tobeto.hotelReservationSystem.services.dtos.requests.user.AddUserRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.user.AddUserResponse;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    AddUserResponse add(AddUserRequest request);

}
