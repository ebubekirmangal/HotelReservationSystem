package com.tobeto.hotelReservationSystem.services.abstracts;

import com.tobeto.hotelReservationSystem.entities.Feedback;
import com.tobeto.hotelReservationSystem.services.dtos.requests.feedback.AddFeedbackRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.feedback.UpdateFeedbackRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.feedback.AddFeedbackResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.feedback.GetAllFeedbackResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.feedback.GetByIdFeedbackResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.feedback.UpdateFeedbackResponse;

import java.util.List;

public interface FeedbackService {

    AddFeedbackResponse add(AddFeedbackRequest feedback);

    UpdateFeedbackResponse update(UpdateFeedbackRequest feedback);

    List<GetAllFeedbackResponse> getAll();

    GetByIdFeedbackResponse getById(int id);

    void delete(int id);

    Feedback getFeedbackById(int id);
}
