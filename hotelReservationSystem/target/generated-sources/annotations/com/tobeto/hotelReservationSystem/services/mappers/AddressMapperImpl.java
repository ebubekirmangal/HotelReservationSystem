package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Address;
import com.tobeto.hotelReservationSystem.services.dtos.requests.address.AddAddressRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.address.UpdateAddressRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.address.AddAddressResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.address.GetByIdAddressResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.address.ListAddressResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.address.UpdateAddressResponse;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-29T20:46:11+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.3 (Oracle Corporation)"
)
public class AddressMapperImpl implements AddressMapper {

    @Override
    public Address addAddressRequestToAddress(AddAddressRequest request) {
        if ( request == null ) {
            return null;
        }

        Address address = new Address();

        address.setDescription( request.getDescription() );

        return address;
    }

    @Override
    public AddAddressResponse addressToAddAddressResponse(Address address) {
        if ( address == null ) {
            return null;
        }

        AddAddressResponse addAddressResponse = new AddAddressResponse();

        addAddressResponse.setId( address.getId() );

        return addAddressResponse;
    }

    @Override
    public Address updateAddressRequestToAddress(UpdateAddressRequest request) {
        if ( request == null ) {
            return null;
        }

        Address address = new Address();

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

        updateAddressResponse.setId( address.getId() );

        return updateAddressResponse;
    }

    @Override
    public ListAddressResponse addressToGetAllAddressResponses(Address address) {
        if ( address == null ) {
            return null;
        }

        ListAddressResponse listAddressResponse = new ListAddressResponse();

        listAddressResponse.setId( address.getId() );

        return listAddressResponse;
    }

    @Override
    public GetByIdAddressResponse addressToGetByIdAddressResponse(Address address) {
        if ( address == null ) {
            return null;
        }

        GetByIdAddressResponse getByIdAddressResponse = new GetByIdAddressResponse();

        getByIdAddressResponse.setId( address.getId() );

        return getByIdAddressResponse;
    }
}
