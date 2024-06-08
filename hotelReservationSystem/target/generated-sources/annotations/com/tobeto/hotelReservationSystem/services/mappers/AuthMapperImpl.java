package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.User;
import com.tobeto.hotelReservationSystem.services.dtos.requests.auth.RegisterAuthRequest;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-08T14:17:08+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class AuthMapperImpl implements AuthMapper {

    @Override
    public User userToRegisterAuthRequest(RegisterAuthRequest request) {
        if ( request == null ) {
            return null;
        }

        User user = new User();

        user.setFirstName( request.getFirstName() );
        user.setLastName( request.getLastName() );
        user.setRole( request.getRole() );
        user.setEmail( request.getEmail() );
        user.setPassword( request.getPassword() );
        user.setPasswordConfirm( request.getPasswordConfirm() );

        return user;
    }
}
