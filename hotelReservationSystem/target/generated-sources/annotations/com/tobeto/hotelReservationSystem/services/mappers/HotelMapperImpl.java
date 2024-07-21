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
    date = "2024-07-04T17:40:08+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class HotelMapperImpl implements HotelMapper {

    @Override
    public Hotel hotelToAddHotelRequest(AddHotelRequest request) {
        if ( request == null ) {
            return null;
        }

        Hotel hotel = new Hotel();

        hotel.setUser( addHotelRequestToUser( request ) );
        hotel.setImages( mapImageDataToImages( request.getImageData() ) );
        hotel.setFeatures( mapFeaturesToFeatureEntities( request.getFeatures() ) );
        hotel.setName( request.getName() );
        hotel.setPhone( request.getPhone() );
        hotel.setEmail( request.getEmail() );
        hotel.setStar( request.getStar() );
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
        hotel.setEmail( request.getEmail() );
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
        addHotelResponse.setEmail( hotel.getEmail() );
        addHotelResponse.setHousingType( hotel.getHousingType() );

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
        updateHotelResponse.setEmail( hotel.getEmail() );
        updateHotelResponse.setHousingType( hotel.getHousingType() );

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
        listHotelResponse.setEmail( hotel.getEmail() );
        listHotelResponse.setHousingType( hotel.getHousingType() );

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
        getByIdHotelResponse.setEmail( hotel.getEmail() );
        getByIdHotelResponse.setHousingType( hotel.getHousingType() );

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
