package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.User;
import com.tobeto.hotelReservationSystem.services.dtos.requests.user.AddUserRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.user.AddUserResponse;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-29T20:46:11+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.3 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public User userToAddUserRequest(AddUserRequest request) {
        if ( request == null ) {
            return null;
        }

        User user = new User();

        user.setEmail( request.getEmail() );
        user.setPassword( request.getPassword() );

        return user;
    }

    @Override
    public AddUserResponse addUserResponseToUser(User user) {
        if ( user == null ) {
            return null;
        }

        AddUserResponse addUserResponse = new AddUserResponse();

        addUserResponse.setId( user.getId() );
        addUserResponse.setEmail( user.getEmail() );
        addUserResponse.setPassword( user.getPassword() );

        return addUserResponse;
    }
}
