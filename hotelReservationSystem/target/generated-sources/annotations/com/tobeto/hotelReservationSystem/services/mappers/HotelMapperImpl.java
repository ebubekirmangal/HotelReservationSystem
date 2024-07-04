package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Address;
import com.tobeto.hotelReservationSystem.entities.Hotel;
import com.tobeto.hotelReservationSystem.entities.User;
import com.tobeto.hotelReservationSystem.services.dtos.requests.hotel.AddHotelRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.hotel.UpdateHotelRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.AddHotelResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.GetByIdHotelResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.ListHotelResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.UpdateHotelResponse;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-04T23:10:24+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.3 (Oracle Corporation)"
)
public class HotelMapperImpl implements HotelMapper {

    @Override
    public Hotel hotelToAddHotelRequest(AddHotelRequest request) {
        if ( request == null ) {
            return null;
        }

        Hotel hotel = new Hotel();

        hotel.setUser( addHotelRequestToUser( request ) );
        hotel.setAddress( addHotelRequestToAddress( request ) );
        hotel.setImages( mapImageDataToImages( request.getImageIds() ) );
        hotel.setFeatures( mapFeaturesToFeatureEntities( request.getFeatureIds() ) );
        hotel.setName( request.getName() );
        hotel.setEmail( request.getEmail() );
        hotel.setStar( request.getStar() );
        hotel.setAccommodationType( request.getAccommodationType() );

        return hotel;
    }

    @Override
    public Hotel hotelToUpdateHotelRequest(UpdateHotelRequest request) {
        if ( request == null ) {
            return null;
        }

        Hotel hotel = new Hotel();

        hotel.setUser( updateHotelRequestToUser( request ) );
        hotel.setAddress( updateHotelRequestToAddress( request ) );
        hotel.setImages( mapImageDataToImages( request.getImageIds() ) );
        hotel.setFeatures( mapFeaturesToFeatureEntities( request.getFeatureIds() ) );
        hotel.setId( request.getId() );
        hotel.setName( request.getName() );
        hotel.setEmail( request.getEmail() );
        hotel.setRating( request.getRating() );
        hotel.setStar( request.getStar() );
        hotel.setAccommodationType( request.getAccommodationType() );

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

        return getByIdHotelResponse;
    }

    protected User addHotelRequestToUser(AddHotelRequest addHotelRequest) {
        if ( addHotelRequest == null ) {
            return null;
        }

        User user = new User();

        user.setId( addHotelRequest.getUserId() );

        return user;
    }

    protected Address addHotelRequestToAddress(AddHotelRequest addHotelRequest) {
        if ( addHotelRequest == null ) {
            return null;
        }

        Address address = new Address();

        address.setId( addHotelRequest.getAddressId() );

        return address;
    }

    protected User updateHotelRequestToUser(UpdateHotelRequest updateHotelRequest) {
        if ( updateHotelRequest == null ) {
            return null;
        }

        User user = new User();

        user.setId( updateHotelRequest.getUserId() );

        return user;
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
