package com.tobeto.hotelReservationSystem.services.dtos.responses.reply;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetByFeedbackIdForReply {

    private int id;

    private int userId;

    private int feedbackId;

    private String title;

    private String content;

    private boolean transactionalDone;
}
