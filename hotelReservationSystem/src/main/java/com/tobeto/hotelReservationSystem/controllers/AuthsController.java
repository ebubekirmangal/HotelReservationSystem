package com.tobeto.hotelReservationSystem.controllers;

import com.tobeto.hotelReservationSystem.services.abstracts.AuthService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.auth.LoginAuthRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.auth.RegisterAuthRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.auth.LoginAuthResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.auth.RegisterAuthResponse;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthsController {
    private final AuthService authService;
    @PostMapping("/register")
    public RegisterAuthResponse register(@RequestBody  @Valid RegisterAuthRequest request){
        return authService.register(request);
    }
    @PostMapping("/login")
    public LoginAuthResponse login(@RequestBody @Valid LoginAuthRequest request){
        return authService.login(request);
    }

}