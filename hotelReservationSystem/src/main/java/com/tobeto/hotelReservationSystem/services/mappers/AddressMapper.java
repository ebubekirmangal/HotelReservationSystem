package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Address;
import com.tobeto.hotelReservationSystem.services.dtos.requests.address.AddAddressRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.address.UpdateAddressRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.address.AddAddressResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.address.GetByIdAddressResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.address.ListAddressResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.address.UpdateAddressResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressMapper {
    AddressMapper INSTANCE= Mappers.getMapper(AddressMapper.class);

   Address addAddressRequestToAddress(AddAddressRequest request);
   AddAddressResponse addressToAddAddressResponse(Address address);
    Address updateAddressRequestToAddress(UpdateAddressRequest request);
     UpdateAddressResponse addressToUpdateAddressResponse(Address address);
    ListAddressResponse addressToGetAllAddressResponses(Address address);
     GetByIdAddressResponse addressToGetByIdAddressResponse(Address address);
}
