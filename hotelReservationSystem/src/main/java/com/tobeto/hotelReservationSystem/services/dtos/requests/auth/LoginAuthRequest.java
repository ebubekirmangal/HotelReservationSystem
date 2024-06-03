package com.tobeto.hotelReservationSystem.services.dtos.requests.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginAuthRequest {

    private String email;

    private String password;
}