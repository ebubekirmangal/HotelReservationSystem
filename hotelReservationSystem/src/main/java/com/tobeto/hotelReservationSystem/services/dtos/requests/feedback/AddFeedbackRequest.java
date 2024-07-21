package com.tobeto.hotelReservationSystem.services.dtos.requests.feedback;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddFeedbackRequest {

    private int userId;

    private int reservationId;

    private String title;

    private String content;

    private int rating;
    @Setter
    private LocalDateTime date;
}
