package com.tobeto.hotelReservationSystem.services.dtos.responses.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChangePasswordResponse {
    private boolean success;

    private String message;
}
