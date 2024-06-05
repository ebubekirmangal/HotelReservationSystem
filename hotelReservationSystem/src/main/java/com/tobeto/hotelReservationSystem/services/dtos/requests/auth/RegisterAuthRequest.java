package com.tobeto.hotelReservationSystem.services.dtos.requests.auth;

import com.tobeto.hotelReservationSystem.entities.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterAuthRequest {

    private Role role;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String passwordConfirm;
}