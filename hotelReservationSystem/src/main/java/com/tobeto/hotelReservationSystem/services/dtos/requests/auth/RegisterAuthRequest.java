package com.tobeto.hotelReservationSystem.services.dtos.requests.auth;

import com.tobeto.hotelReservationSystem.entities.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterAuthRequest {

    private Role role;

    private String firstName;

    private String lastName;

    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Password is mandatory")
    private String password;

    @NotBlank(message = "Password confirmation is mandatory")

    private String passwordConfirm;
}