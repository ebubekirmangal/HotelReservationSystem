package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Reply;
import com.tobeto.hotelReservationSystem.services.dtos.requests.reply.AddReplyRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.reply.UpdateReplyRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reply.AddReplyResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reply.GetAllReplyResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reply.GetByIdReplyResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reply.UpdateReplyResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ReplyMapper {

    ReplyMapper INSTANCE = Mappers.getMapper(ReplyMapper.class);

    @Mapping(target = "user.id", source = "userId")
    @Mapping(target = "feedback.id", source = "feedbackId")
    Reply replyToAddReplyRequest(AddReplyRequest request);
    @Mapping(target = "user.id", source = "userId")
    @Mapping(target = "feedback.id", source = "feedbackId")
    Reply replyToUpdateReplyRequest(UpdateReplyRequest request);


    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "feedbackId", source = "feedback.id")
    AddReplyResponse addReplyResponseToReply(Reply request);
    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "feedbackId", source = "feedback.id")
    UpdateReplyResponse updateReplyResponseToReply(Reply request);
    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "feedbackId", source = "feedback.id")
    GetAllReplyResponse getAllReplyResponsesToReply(Reply responses);
    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "feedbackId", source = "feedback.id")
    GetByIdReplyResponse getByIdReplyResponseToReply(Reply response);
}
