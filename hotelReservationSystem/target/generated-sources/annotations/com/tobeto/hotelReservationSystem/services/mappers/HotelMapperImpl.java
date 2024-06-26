package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Address;
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
    date = "2024-06-24T18:23:42+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.3 (Oracle Corporation)"
)
public class HotelMapperImpl implements HotelMapper {

    @Override
    public Hotel hotelToAddHotelRequest(AddHotelRequest request) {
        if ( request == null ) {
            return null;
        }

        Hotel hotel = new Hotel();

        hotel.setAddress( addHotelRequestToAddress( request ) );
        hotel.setName( request.getName() );
        hotel.setPhoneNumber( String.valueOf( request.getPhoneNumber() ) );
        hotel.setEmail( request.getEmail() );
        hotel.setRating( request.getRating() );
        hotel.setHousingType( request.getHousingType() );

        return hotel;
    }

    @Override
    public Hotel hotelToUpdateHotelRequest(UpdateHotelRequest request) {
        if ( request == null ) {
            return null;
        }

        Hotel hotel = new Hotel();

        hotel.setAddress( updateHotelRequestToAddress( request ) );
        hotel.setId( request.getId() );
        hotel.setName( request.getName() );
        hotel.setPhoneNumber( String.valueOf( request.getPhoneNumber() ) );
        hotel.setEmail( request.getEmail() );
        hotel.setRating( request.getRating() );
        hotel.setHousingType( request.getHousingType() );

        return hotel;
    }

    @Override
    public AddHotelResponse addHotelResponseToHotel(Hotel hotel) {
        if ( hotel == null ) {
            return null;
        }

        AddHotelResponse addHotelResponse = new AddHotelResponse();

        addHotelResponse.setAddressId( hotelAddressId( hotel ) );
        addHotelResponse.setId( hotel.getId() );
        addHotelResponse.setName( hotel.getName() );
        if ( hotel.getPhoneNumber() != null ) {
            addHotelResponse.setPhoneNumber( Integer.parseInt( hotel.getPhoneNumber() ) );
        }
        addHotelResponse.setEmail( hotel.getEmail() );
        addHotelResponse.setHousingType( hotel.getHousingType() );
        addHotelResponse.setRating( hotel.getRating() );

        return addHotelResponse;
    }

    @Override
    public UpdateHotelResponse updateHotelResponseToHotel(Hotel hotel) {
        if ( hotel == null ) {
            return null;
        }

        UpdateHotelResponse updateHotelResponse = new UpdateHotelResponse();

        updateHotelResponse.setAddressId( hotelAddressId( hotel ) );
        updateHotelResponse.setId( hotel.getId() );
        updateHotelResponse.setName( hotel.getName() );
        if ( hotel.getPhoneNumber() != null ) {
            updateHotelResponse.setPhoneNumber( Integer.parseInt( hotel.getPhoneNumber() ) );
        }
        updateHotelResponse.setEmail( hotel.getEmail() );
        updateHotelResponse.setHousingType( hotel.getHousingType() );
        updateHotelResponse.setRating( hotel.getRating() );

        return updateHotelResponse;
    }

    @Override
    public ListHotelResponse ListHotelResponseToHotel(Hotel hotel) {
        if ( hotel == null ) {
            return null;
        }

        ListHotelResponse listHotelResponse = new ListHotelResponse();

        listHotelResponse.setAddressId( hotelAddressId( hotel ) );
        listHotelResponse.setId( hotel.getId() );
        listHotelResponse.setName( hotel.getName() );
        if ( hotel.getPhoneNumber() != null ) {
            listHotelResponse.setPhoneNumber( Integer.parseInt( hotel.getPhoneNumber() ) );
        }
        listHotelResponse.setEmail( hotel.getEmail() );
        listHotelResponse.setHousingType( hotel.getHousingType() );
        listHotelResponse.setRating( hotel.getRating() );

        return listHotelResponse;
    }

    @Override
    public GetByIdHotelResponse getByIdHotelResponseToHotel(Hotel hotel) {
        if ( hotel == null ) {
            return null;
        }

        GetByIdHotelResponse getByIdHotelResponse = new GetByIdHotelResponse();

        getByIdHotelResponse.setAddressId( hotelAddressId( hotel ) );
        getByIdHotelResponse.setId( hotel.getId() );
        getByIdHotelResponse.setName( hotel.getName() );
        if ( hotel.getPhoneNumber() != null ) {
            getByIdHotelResponse.setPhoneNumber( Integer.parseInt( hotel.getPhoneNumber() ) );
        }
        getByIdHotelResponse.setEmail( hotel.getEmail() );
        getByIdHotelResponse.setHousingType( hotel.getHousingType() );
        getByIdHotelResponse.setRating( hotel.getRating() );

        return getByIdHotelResponse;
    }

    protected Address addHotelRequestToAddress(AddHotelRequest addHotelRequest) {
        if ( addHotelRequest == null ) {
            return null;
        }

        Address address = new Address();

        address.setId( addHotelRequest.getAddressId() );

        return address;
    }

    protected Address updateHotelRequestToAddress(UpdateHotelRequest updateHotelRequest) {
        if ( updateHotelRequest == null ) {
            return null;
        }

        Address address = new Address();

        address.setId( updateHotelRequest.getAddressId() );

        return address;
    }

    private int hotelAddressId(Hotel hotel) {
        Address address = hotel.getAddress();
        if ( address == null ) {
            return 0;
        }
        return address.getId();
    }
}
