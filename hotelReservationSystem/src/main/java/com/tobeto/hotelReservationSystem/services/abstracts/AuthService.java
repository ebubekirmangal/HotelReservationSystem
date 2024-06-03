package com.tobeto.hotelReservationSystem.services.abstracts;

import com.tobeto.hotelReservationSystem.services.dtos.requests.auth.LoginAuthRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.auth.RegisterAuthRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.auth.LoginAuthResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.auth.RegisterAuthResponse;

public interface AuthService {

    RegisterAuthResponse register(RegisterAuthRequest request);

    LoginAuthResponse login(LoginAuthRequest request);
}