package com.tobeto.hotelReservationSystem.services.dtos.requests.auth;

import com.tobeto.hotelReservationSystem.entities.enums.Role;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterAuthRequest {

    @NotBlank(message = "Email is mandatory")
    private Role role;

    @NotBlank(message = "Email is mandatory")
    private String firstName;

    @NotBlank(message = "Email is mandatory")
    private String lastName;

    @NotBlank(message = "Email is mandatory")
    private LocalDate dateOfBirth;

    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Password is mandatory")
    private String password;

    @NotBlank(message = "Password confirmation is mandatory")
    private String passwordConfirm;
}