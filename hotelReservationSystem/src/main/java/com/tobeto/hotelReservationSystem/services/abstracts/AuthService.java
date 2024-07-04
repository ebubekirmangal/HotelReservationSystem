package com.tobeto.hotelReservationSystem.services.abstracts;

import com.tobeto.hotelReservationSystem.services.dtos.requests.auth.ChangePasswordRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.auth.LoginAuthRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.auth.RegisterAuthRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.auth.ChangePasswordResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.auth.LoginAuthResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.auth.RegisterAuthResponse;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AuthService extends UserDetailsService {

    RegisterAuthResponse register(RegisterAuthRequest request);

    LoginAuthResponse login(LoginAuthRequest request);

    ChangePasswordResponse changePassword(ChangePasswordRequest request);
}