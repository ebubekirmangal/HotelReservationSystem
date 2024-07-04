package com.tobeto.hotelReservationSystem.services.dtos.requests.email;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddEmailRequest {

    private String toAddress;
    private String subject;
    private String body;
    private int userId;
}
