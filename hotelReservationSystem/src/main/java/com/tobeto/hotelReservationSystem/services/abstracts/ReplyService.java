package com.tobeto.hotelReservationSystem.services.abstracts;

import com.tobeto.hotelReservationSystem.services.dtos.requests.reply.AddReplyRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.reply.UpdateReplyRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reply.AddReplyResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reply.GetAllReplyResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reply.GetByIdReplyResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reply.UpdateReplyResponse;

import java.util.List;

public interface ReplyService {

    AddReplyResponse add(AddReplyRequest request);
    UpdateReplyResponse update(UpdateReplyRequest request);
    GetByIdReplyResponse getById(int id);
    List<GetAllReplyResponse> getAll();
    void delete(int id);
}
