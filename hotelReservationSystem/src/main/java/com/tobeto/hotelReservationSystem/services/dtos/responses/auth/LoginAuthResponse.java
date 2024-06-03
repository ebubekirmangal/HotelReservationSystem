package com.tobeto.hotelReservationSystem.services.dtos.responses.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginAuthResponse {

    private String token;
}