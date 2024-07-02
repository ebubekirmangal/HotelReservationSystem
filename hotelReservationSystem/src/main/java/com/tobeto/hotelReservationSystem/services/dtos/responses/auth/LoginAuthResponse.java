package com.tobeto.hotelReservationSystem.services.dtos.responses.auth;

import com.tobeto.hotelReservationSystem.entities.User;
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

    private User user;
}