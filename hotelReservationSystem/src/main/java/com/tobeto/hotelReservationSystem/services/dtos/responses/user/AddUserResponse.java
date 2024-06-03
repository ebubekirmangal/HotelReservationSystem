package com.tobeto.hotelReservationSystem.services.dtos.responses.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddUserResponse {

    private int id;

//    private UserType userType;

    private String email;

    private String password;

//    private String passwordCorrect;
}
