package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Hotel;
import com.tobeto.hotelReservationSystem.services.dtos.requests.hotel.AddHotelRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.hotel.UpdateHotelRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.AddHotelResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.GetByIdHotelResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.ListHotelResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.UpdateHotelResponse;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-11T17:14:22+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class HotelMapperImpl implements HotelMapper {

    @Override
    public Hotel hotelToAddHotelRequest(AddHotelRequest request) {
        if ( request == null ) {
            return null;
        }

        Hotel hotel = new Hotel();

        hotel.setName( request.getName() );
        hotel.setAddress( request.getAddress() );
        hotel.setPhoneNumber( request.getPhoneNumber() );
        hotel.setEmail( request.getEmail() );

        return hotel;
    }

    @Override
    public Hotel hotelToUpdateHotelRequest(UpdateHotelRequest request) {
        if ( request == null ) {
            return null;
        }

        Hotel hotel = new Hotel();

        hotel.setId( request.getId() );
        hotel.setName( request.getName() );
        hotel.setAddress( request.getAddress() );
        hotel.setPhoneNumber( request.getPhoneNumber() );
        hotel.setEmail( request.getEmail() );

        return hotel;
    }

    @Override
    public AddHotelResponse addHotelResponseToHotel(Hotel hotel) {
        if ( hotel == null ) {
            return null;
        }

        AddHotelResponse addHotelResponse = new AddHotelResponse();

        addHotelResponse.setId( hotel.getId() );
        addHotelResponse.setName( hotel.getName() );
        addHotelResponse.setAddress( hotel.getAddress() );
        addHotelResponse.setPhoneNumber( hotel.getPhoneNumber() );
        addHotelResponse.setEmail( hotel.getEmail() );

        return addHotelResponse;
    }

    @Override
    public UpdateHotelResponse updateHotelResponseToHotel(Hotel hotel) {
        if ( hotel == null ) {
            return null;
        }

        UpdateHotelResponse updateHotelResponse = new UpdateHotelResponse();

        updateHotelResponse.setId( hotel.getId() );
        updateHotelResponse.setName( hotel.getName() );
        updateHotelResponse.setAddress( hotel.getAddress() );
        updateHotelResponse.setPhoneNumber( hotel.getPhoneNumber() );
        updateHotelResponse.setEmail( hotel.getEmail() );

        return updateHotelResponse;
    }

    @Override
    public ListHotelResponse ListHotelResponseToHotel(Hotel hotel) {
        if ( hotel == null ) {
            return null;
        }

        ListHotelResponse listHotelResponse = new ListHotelResponse();

        listHotelResponse.setId( hotel.getId() );
        listHotelResponse.setName( hotel.getName() );
        listHotelResponse.setAddress( hotel.getAddress() );
        listHotelResponse.setPhoneNumber( hotel.getPhoneNumber() );
        listHotelResponse.setEmail( hotel.getEmail() );

        return listHotelResponse;
    }

    @Override
    public GetByIdHotelResponse getByIdHotelResponseToHotel(Hotel hotel) {
        if ( hotel == null ) {
            return null;
        }

        GetByIdHotelResponse getByIdHotelResponse = new GetByIdHotelResponse();

        getByIdHotelResponse.setId( hotel.getId() );
        getByIdHotelResponse.setName( hotel.getName() );
        getByIdHotelResponse.setAddress( hotel.getAddress() );
        getByIdHotelResponse.setPhoneNumber( hotel.getPhoneNumber() );
        getByIdHotelResponse.setEmail( hotel.getEmail() );

        return getByIdHotelResponse;
    }
}
