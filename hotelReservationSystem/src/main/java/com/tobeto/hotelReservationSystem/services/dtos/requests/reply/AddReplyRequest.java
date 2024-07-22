package com.tobeto.hotelReservationSystem.services.dtos.requests.reply;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddReplyRequest {

    private int userId;

    private int feedbackId;

    private String title;

    private String content;
    @Setter
    private LocalDateTime date;
}
