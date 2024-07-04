package com.tobeto.hotelReservationSystem.services.dtos.requests.auth;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginAuthRequest {
    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email should be valid")
    private String userEmail;
    @NotBlank(message = "Password is mandatory")
    private String password;
}