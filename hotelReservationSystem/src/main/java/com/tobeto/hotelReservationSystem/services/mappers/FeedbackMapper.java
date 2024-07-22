package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Feedback;
import com.tobeto.hotelReservationSystem.services.dtos.requests.feedback.AddFeedbackRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.feedback.UpdateFeedbackRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.feedback.AddFeedbackResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.feedback.GetAllFeedbackResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.feedback.GetByIdFeedbackResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.feedback.UpdateFeedbackResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface FeedbackMapper {

    FeedbackMapper INSTANCE= Mappers.getMapper(FeedbackMapper.class);

    @Mapping(target = "user.id", source = "userId")
    @Mapping(target = "reservation.id", source = "reservationId")
    Feedback feedbackToAddFeedbackRequest(AddFeedbackRequest feedback);
    @Mapping(target = "user.id", source = "userId")
    @Mapping(target = "reservation.id", source = "reservationId")
    Feedback feedbackToUpdateFeedbackRequest(UpdateFeedbackRequest feedback);


    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "reservationId", source = "reservation.id")
    AddFeedbackResponse addFeedbackResponseToFeedback(Feedback feedback);
    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "reservationId", source = "reservation.id")
    UpdateFeedbackResponse updateFeedbackResponseToFeedback(Feedback feedback);
    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "reservationId", source = "reservation.id")
    GetByIdFeedbackResponse getByIdFeedbackResponseFeedback(Feedback feedback);
    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "reservationId", source = "reservation.id")
    @Mapping(target = "transactionDone",source = "reply.transactionDone")
    GetAllFeedbackResponse getAllFeedbackResponsesToFeedback(Feedback feedbacks);
}
