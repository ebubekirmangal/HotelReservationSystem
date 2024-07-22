package com.tobeto.hotelReservationSystem.services.abstracts;

import com.tobeto.hotelReservationSystem.services.dtos.requests.reply.AddReplyRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.reply.UpdateReplyRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reply.*;

import java.util.List;

public interface ReplyService {

    AddReplyResponse add(AddReplyRequest request);
    UpdateReplyResponse update(UpdateReplyRequest request);
    GetByIdReplyResponse getById(int id);
    List<GetAllReplyResponse> getAll();
    void delete(int id);
    GetByFeedbackIdForReply getReplyByFeedbackId(int feedbackId);
}
