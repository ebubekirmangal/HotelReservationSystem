package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Email;
import com.tobeto.hotelReservationSystem.services.dtos.requests.email.AddEmailRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.email.AddEmailResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmailMapper {
    EmailMapper INSTANCE = Mappers.getMapper(EmailMapper.class);
    @Mapping(target = "user.id", source = "userId")
    Email emailToAddEmailRequest(AddEmailRequest request);
    @Mapping(target = "userId", source = "user.id")
    AddEmailResponse addEmailResponseToEmail(Email email);
}
