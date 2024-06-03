package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.User;
import com.tobeto.hotelReservationSystem.services.dtos.requests.auth.RegisterAuthRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthMapper {

    AuthMapper INSTANCE = Mappers.getMapper(AuthMapper.class);

    User userToRegisterAuthRequest(RegisterAuthRequest request);

}