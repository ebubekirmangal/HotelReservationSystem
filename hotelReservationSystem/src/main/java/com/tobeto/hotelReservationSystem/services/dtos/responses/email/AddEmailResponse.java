package com.tobeto.hotelReservationSystem.services.dtos.responses.email;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddEmailResponse {
    private int id;
    private String toAddress;
    private String subject;
    private String body;
    private LocalDateTime sentDate;
    private int userId; // veya gerektiği şekilde User'ı temsil eden bir alan
}
