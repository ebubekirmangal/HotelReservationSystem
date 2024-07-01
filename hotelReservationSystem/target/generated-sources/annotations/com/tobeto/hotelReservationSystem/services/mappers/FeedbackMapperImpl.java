package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Feedback;
import com.tobeto.hotelReservationSystem.entities.Reservation;
import com.tobeto.hotelReservationSystem.entities.User;
import com.tobeto.hotelReservationSystem.services.dtos.requests.feedback.AddFeedbackRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.feedback.UpdateFeedbackRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.feedback.AddFeedbackResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.feedback.GetAllFeedbackResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.feedback.GetByIdFeedbackResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.feedback.UpdateFeedbackResponse;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-30T15:19:17+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class FeedbackMapperImpl implements FeedbackMapper {

    @Override
    public Feedback feedbackToAddFeedbackRequest(AddFeedbackRequest feedback) {
        if ( feedback == null ) {
            return null;
        }

        Feedback feedback1 = new Feedback();

        feedback1.setUser( addFeedbackRequestToUser( feedback ) );
        feedback1.setReservation( addFeedbackRequestToReservation( feedback ) );
        feedback1.setContent( feedback.getContent() );
        feedback1.setRating( feedback.getRating() );
        feedback1.setDate( feedback.getDate() );

        return feedback1;
    }

    @Override
    public Feedback feedbackToUpdateFeedbackRequest(UpdateFeedbackRequest feedback) {
        if ( feedback == null ) {
            return null;
        }

        Feedback feedback1 = new Feedback();

        feedback1.setUser( updateFeedbackRequestToUser( feedback ) );
        feedback1.setReservation( updateFeedbackRequestToReservation( feedback ) );
        feedback1.setId( feedback.getId() );
        feedback1.setContent( feedback.getContent() );
        feedback1.setRating( feedback.getRating() );
        feedback1.setDate( feedback.getDate() );

        return feedback1;
    }

    @Override
    public AddFeedbackResponse addFeedbackResponseToFeedback(Feedback feedback) {
        if ( feedback == null ) {
            return null;
        }

        AddFeedbackResponse addFeedbackResponse = new AddFeedbackResponse();

        addFeedbackResponse.setUserId( feedbackUserId( feedback ) );
        addFeedbackResponse.setReservationId( feedbackReservationId( feedback ) );
        addFeedbackResponse.setId( feedback.getId() );
        addFeedbackResponse.setContent( feedback.getContent() );
        addFeedbackResponse.setRating( feedback.getRating() );
        addFeedbackResponse.setDate( feedback.getDate() );

        return addFeedbackResponse;
    }

    @Override
    public UpdateFeedbackResponse updateFeedbackResponseToFeedback(Feedback feedback) {
        if ( feedback == null ) {
            return null;
        }

        UpdateFeedbackResponse updateFeedbackResponse = new UpdateFeedbackResponse();

        updateFeedbackResponse.setUserId( feedbackUserId( feedback ) );
        updateFeedbackResponse.setReservationId( feedbackReservationId( feedback ) );
        updateFeedbackResponse.setId( feedback.getId() );
        updateFeedbackResponse.setContent( feedback.getContent() );
        updateFeedbackResponse.setRating( feedback.getRating() );
        updateFeedbackResponse.setDate( feedback.getDate() );

        return updateFeedbackResponse;
    }

    @Override
    public GetByIdFeedbackResponse getByIdFeedbackResponseFeedback(Feedback feedback) {
        if ( feedback == null ) {
            return null;
        }

        GetByIdFeedbackResponse getByIdFeedbackResponse = new GetByIdFeedbackResponse();

        getByIdFeedbackResponse.setUserId( feedbackUserId( feedback ) );
        getByIdFeedbackResponse.setReservationId( feedbackReservationId( feedback ) );
        getByIdFeedbackResponse.setId( feedback.getId() );
        getByIdFeedbackResponse.setContent( feedback.getContent() );
        getByIdFeedbackResponse.setRating( feedback.getRating() );
        getByIdFeedbackResponse.setDate( feedback.getDate() );

        return getByIdFeedbackResponse;
    }

    @Override
    public GetAllFeedbackResponse getAllFeedbackResponsesToFeedback(Feedback feedbacks) {
        if ( feedbacks == null ) {
            return null;
        }

        GetAllFeedbackResponse getAllFeedbackResponse = new GetAllFeedbackResponse();

        getAllFeedbackResponse.setUserId( feedbackUserId( feedbacks ) );
        getAllFeedbackResponse.setReservationId( feedbackReservationId( feedbacks ) );
        getAllFeedbackResponse.setId( feedbacks.getId() );
        getAllFeedbackResponse.setContent( feedbacks.getContent() );
        getAllFeedbackResponse.setRating( feedbacks.getRating() );
        getAllFeedbackResponse.setDate( feedbacks.getDate() );

        return getAllFeedbackResponse;
    }

    protected User addFeedbackRequestToUser(AddFeedbackRequest addFeedbackRequest) {
        if ( addFeedbackRequest == null ) {
            return null;
        }

        User user = new User();

        user.setId( addFeedbackRequest.getUserId() );

        return user;
    }

    protected Reservation addFeedbackRequestToReservation(AddFeedbackRequest addFeedbackRequest) {
        if ( addFeedbackRequest == null ) {
            return null;
        }

        Reservation reservation = new Reservation();

        reservation.setId( addFeedbackRequest.getReservationId() );

        return reservation;
    }

    protected User updateFeedbackRequestToUser(UpdateFeedbackRequest updateFeedbackRequest) {
        if ( updateFeedbackRequest == null ) {
            return null;
        }

        User user = new User();

        user.setId( updateFeedbackRequest.getUserId() );

        return user;
    }

    protected Reservation updateFeedbackRequestToReservation(UpdateFeedbackRequest updateFeedbackRequest) {
        if ( updateFeedbackRequest == null ) {
            return null;
        }

        Reservation reservation = new Reservation();

        reservation.setId( updateFeedbackRequest.getReservationId() );

        return reservation;
    }

    private int feedbackUserId(Feedback feedback) {
        User user = feedback.getUser();
        if ( user == null ) {
            return 0;
        }
        return user.getId();
    }

    private int feedbackReservationId(Feedback feedback) {
        Reservation reservation = feedback.getReservation();
        if ( reservation == null ) {
            return 0;
        }
        return reservation.getId();
    }
}
