package com.tobeto.hotelReservationSystem.services.dtos.responses.feedback;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetAllFeedbackResponse {

    private int id;

    private int userId;

    private int reservationId;

    private String content;

    private int rating;

    private LocalDateTime date;
}
