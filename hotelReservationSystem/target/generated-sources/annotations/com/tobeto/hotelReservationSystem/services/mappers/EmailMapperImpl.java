package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Email;
import com.tobeto.hotelReservationSystem.entities.User;
import com.tobeto.hotelReservationSystem.services.dtos.requests.email.AddEmailRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.email.AddEmailResponse;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-04T23:10:24+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.3 (Oracle Corporation)"
)
public class EmailMapperImpl implements EmailMapper {

    @Override
    public Email emailToAddEmailRequest(AddEmailRequest request) {
        if ( request == null ) {
            return null;
        }

        Email email = new Email();

        email.setUser( addEmailRequestToUser( request ) );
        email.setToAddress( request.getToAddress() );
        email.setSubject( request.getSubject() );
        email.setBody( request.getBody() );

        return email;
    }

    @Override
    public AddEmailResponse addEmailResponseToEmail(Email email) {
        if ( email == null ) {
            return null;
        }

        AddEmailResponse addEmailResponse = new AddEmailResponse();

        addEmailResponse.setUserId( emailUserId( email ) );
        addEmailResponse.setId( email.getId() );
        addEmailResponse.setToAddress( email.getToAddress() );
        addEmailResponse.setSubject( email.getSubject() );
        addEmailResponse.setBody( email.getBody() );
        addEmailResponse.setSentDate( email.getSentDate() );

        return addEmailResponse;
    }

    protected User addEmailRequestToUser(AddEmailRequest addEmailRequest) {
        if ( addEmailRequest == null ) {
            return null;
        }

        User user = new User();

        user.setId( addEmailRequest.getUserId() );

        return user;
    }

    private int emailUserId(Email email) {
        User user = email.getUser();
        if ( user == null ) {
            return 0;
        }
        return user.getId();
    }
}
