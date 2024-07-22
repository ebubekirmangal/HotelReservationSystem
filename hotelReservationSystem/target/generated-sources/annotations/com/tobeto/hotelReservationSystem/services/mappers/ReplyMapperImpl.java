package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Feedback;
import com.tobeto.hotelReservationSystem.entities.Reply;
import com.tobeto.hotelReservationSystem.entities.User;
import com.tobeto.hotelReservationSystem.services.dtos.requests.reply.AddReplyRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.reply.UpdateReplyRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reply.AddReplyResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reply.GetAllReplyResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reply.GetByIdReplyResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reply.UpdateReplyResponse;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-21T21:41:16+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class ReplyMapperImpl implements ReplyMapper {

    @Override
    public Reply replyToAddReplyRequest(AddReplyRequest request) {
        if ( request == null ) {
            return null;
        }

        Reply reply = new Reply();

        reply.setUser( addReplyRequestToUser( request ) );
        reply.setFeedback( addReplyRequestToFeedback( request ) );
        reply.setTitle( request.getTitle() );
        reply.setContent( request.getContent() );
        reply.setDate( request.getDate() );

        return reply;
    }

    @Override
    public Reply replyToUpdateReplyRequest(UpdateReplyRequest request) {
        if ( request == null ) {
            return null;
        }

        Reply reply = new Reply();

        reply.setUser( updateReplyRequestToUser( request ) );
        reply.setFeedback( updateReplyRequestToFeedback( request ) );
        reply.setId( request.getId() );
        reply.setTitle( request.getTitle() );
        reply.setContent( request.getContent() );
        reply.setDate( request.getDate() );

        return reply;
    }

    @Override
    public AddReplyResponse addReplyResponseToReply(Reply request) {
        if ( request == null ) {
            return null;
        }

        AddReplyResponse addReplyResponse = new AddReplyResponse();

        addReplyResponse.setUserId( requestUserId( request ) );
        addReplyResponse.setFeedbackId( requestFeedbackId( request ) );
        addReplyResponse.setId( request.getId() );
        addReplyResponse.setDate( request.getDate() );

        return addReplyResponse;
    }

    @Override
    public UpdateReplyResponse updateReplyResponseToReply(Reply request) {
        if ( request == null ) {
            return null;
        }

        UpdateReplyResponse updateReplyResponse = new UpdateReplyResponse();

        updateReplyResponse.setUserId( requestUserId( request ) );
        updateReplyResponse.setFeedbackId( requestFeedbackId( request ) );
        updateReplyResponse.setId( request.getId() );
        updateReplyResponse.setContent( request.getContent() );
        updateReplyResponse.setDate( request.getDate() );

        return updateReplyResponse;
    }

    @Override
    public GetAllReplyResponse getAllReplyResponsesToReply(Reply responses) {
        if ( responses == null ) {
            return null;
        }

        GetAllReplyResponse getAllReplyResponse = new GetAllReplyResponse();

        getAllReplyResponse.setUserId( requestUserId( responses ) );
        getAllReplyResponse.setFeedbackId( requestFeedbackId( responses ) );
        getAllReplyResponse.setId( responses.getId() );
        getAllReplyResponse.setContent( responses.getContent() );
        getAllReplyResponse.setDate( responses.getDate() );

        return getAllReplyResponse;
    }

    @Override
    public GetByIdReplyResponse getByIdReplyResponseToReply(Reply response) {
        if ( response == null ) {
            return null;
        }

        GetByIdReplyResponse getByIdReplyResponse = new GetByIdReplyResponse();

        getByIdReplyResponse.setUserId( requestUserId( response ) );
        getByIdReplyResponse.setFeedbackId( requestFeedbackId( response ) );
        getByIdReplyResponse.setId( response.getId() );
        getByIdReplyResponse.setContent( response.getContent() );
        getByIdReplyResponse.setDate( response.getDate() );

        return getByIdReplyResponse;
    }

    protected User addReplyRequestToUser(AddReplyRequest addReplyRequest) {
        if ( addReplyRequest == null ) {
            return null;
        }

        User user = new User();

        user.setId( addReplyRequest.getUserId() );

        return user;
    }

    protected Feedback addReplyRequestToFeedback(AddReplyRequest addReplyRequest) {
        if ( addReplyRequest == null ) {
            return null;
        }

        Feedback feedback = new Feedback();

        feedback.setId( addReplyRequest.getFeedbackId() );

        return feedback;
    }

    protected User updateReplyRequestToUser(UpdateReplyRequest updateReplyRequest) {
        if ( updateReplyRequest == null ) {
            return null;
        }

        User user = new User();

        user.setId( updateReplyRequest.getUserId() );

        return user;
    }

    protected Feedback updateReplyRequestToFeedback(UpdateReplyRequest updateReplyRequest) {
        if ( updateReplyRequest == null ) {
            return null;
        }

        Feedback feedback = new Feedback();

        feedback.setId( updateReplyRequest.getFeedbackId() );

        return feedback;
    }

    private int requestUserId(Reply reply) {
        User user = reply.getUser();
        if ( user == null ) {
            return 0;
        }
        return user.getId();
    }

    private int requestFeedbackId(Reply reply) {
        Feedback feedback = reply.getFeedback();
        if ( feedback == null ) {
            return 0;
        }
        return feedback.getId();
    }
}
