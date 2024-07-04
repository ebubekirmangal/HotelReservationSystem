package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Address;
import com.tobeto.hotelReservationSystem.entities.Hotel;
import com.tobeto.hotelReservationSystem.entities.addresses.District;
import com.tobeto.hotelReservationSystem.services.dtos.requests.address.AddAddressRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.address.UpdateAddressRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.address.AddAddressResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.address.GetByIdAddressResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.address.ListAddressResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.address.UpdateAddressResponse;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-04T23:10:25+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.3 (Oracle Corporation)"
)
public class AddressMapperImpl implements AddressMapper {

    @Override
    public Address addAddressRequestToAddress(AddAddressRequest request) {
        if ( request == null ) {
            return null;
        }

        Address address = new Address();

        address.setHotel( addAddressRequestToHotel( request ) );
        address.setDistrict( addAddressRequestToDistrict( request ) );
        address.setDescription( request.getDescription() );

        return address;
    }

    @Override
    public AddAddressResponse addressToAddAddressResponse(Address address) {
        if ( address == null ) {
            return null;
        }

        AddAddressResponse addAddressResponse = new AddAddressResponse();

        addAddressResponse.setHotelId( addressHotelId( address ) );
        addAddressResponse.setDistrictId( addressDistrictId( address ) );
        addAddressResponse.setId( address.getId() );

        return addAddressResponse;
    }

    @Override
    public Address updateAddressRequestToAddress(UpdateAddressRequest request) {
        if ( request == null ) {
            return null;
        }

        Address address = new Address();

        address.setHotel( updateAddressRequestToHotel( request ) );
        address.setDistrict( updateAddressRequestToDistrict( request ) );
        address.setId( request.getId() );
        address.setDescription( request.getDescription() );

        return address;
    }

    @Override
    public UpdateAddressResponse addressToUpdateAddressResponse(Address address) {
        if ( address == null ) {
            return null;
        }

        UpdateAddressResponse updateAddressResponse = new UpdateAddressResponse();

        updateAddressResponse.setHotelId( addressHotelId( address ) );
        updateAddressResponse.setDistrictId( addressDistrictId( address ) );
        updateAddressResponse.setId( address.getId() );

        return updateAddressResponse;
    }

    @Override
    public ListAddressResponse addressToGetAllAddressResponses(Address address) {
        if ( address == null ) {
            return null;
        }

        ListAddressResponse listAddressResponse = new ListAddressResponse();

        listAddressResponse.setHotelId( addressHotelId( address ) );
        listAddressResponse.setDistrictId( addressDistrictId( address ) );
        listAddressResponse.setId( address.getId() );

        return listAddressResponse;
    }

    @Override
    public GetByIdAddressResponse addressToGetByIdAddressResponse(Address address) {
        if ( address == null ) {
            return null;
        }

        GetByIdAddressResponse getByIdAddressResponse = new GetByIdAddressResponse();

        getByIdAddressResponse.setHotelId( addressHotelId( address ) );
        getByIdAddressResponse.setDistrictId( addressDistrictId( address ) );
        getByIdAddressResponse.setId( address.getId() );

        return getByIdAddressResponse;
    }

    protected Hotel addAddressRequestToHotel(AddAddressRequest addAddressRequest) {
        if ( addAddressRequest == null ) {
            return null;
        }

        Hotel hotel = new Hotel();

        hotel.setId( addAddressRequest.getHotelId() );

        return hotel;
    }

    protected District addAddressRequestToDistrict(AddAddressRequest addAddressRequest) {
        if ( addAddressRequest == null ) {
            return null;
        }

        District district = new District();

        district.setId( addAddressRequest.getDistrictId() );

        return district;
    }

    private int addressHotelId(Address address) {
        Hotel hotel = address.getHotel();
        if ( hotel == null ) {
            return 0;
        }
        return hotel.getId();
    }

    private int addressDistrictId(Address address) {
        District district = address.getDistrict();
        if ( district == null ) {
            return 0;
        }
        return district.getId();
    }

    protected Hotel updateAddressRequestToHotel(UpdateAddressRequest updateAddressRequest) {
        if ( updateAddressRequest == null ) {
            return null;
        }

        Hotel hotel = new Hotel();

        hotel.setId( updateAddressRequest.getHotelId() );

        return hotel;
    }

    protected District updateAddressRequestToDistrict(UpdateAddressRequest updateAddressRequest) {
        if ( updateAddressRequest == null ) {
            return null;
        }

        District district = new District();

        district.setId( updateAddressRequest.getDistrictId() );

        return district;
    }
}
