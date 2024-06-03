package com.tobeto.hotelReservationSystem.services.dtos.requests.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddUserRequest {

//    private UserType userType;

    private String email;

    private String password;

//    private String passwordCorrect;
}
