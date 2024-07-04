package com.tobeto.hotelReservationSystem.services.dtos.requests.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserRequest {

    private String firstName;

    private String lastName;

    private int phone;

    private String tcIdentificationNo;

    private LocalDate dateOfBirth;

    private String password;

    private String userEmail;
}
