package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Address;
import com.tobeto.hotelReservationSystem.services.dtos.requests.address.AddAddressRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.address.UpdateAddressRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.address.AddAddressResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.address.GetByIdAddressResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.address.ListAddressResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.address.UpdateAddressResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressMapper {
    AddressMapper INSTANCE= Mappers.getMapper(AddressMapper.class);
    @Mapping(target = "hotel.id", source = "hotelId")
    @Mapping(target = "district.id", source = "districtId")
    Address addAddressRequestToAddress(AddAddressRequest request);
    @Mapping(target = "hotelId", source = "hotel.id")
    @Mapping(target = "districtId", source = "district.id")
    AddAddressResponse addressToAddAddressResponse(Address address);
    @Mapping(target = "hotel.id", source = "hotelId")
    @Mapping(target = "district.id", source = "districtId")
    Address updateAddressRequestToAddress(UpdateAddressRequest request);
    @Mapping(target = "hotelId", source = "hotel.id")
    @Mapping(target = "districtId", source = "district.id")
    UpdateAddressResponse addressToUpdateAddressResponse(Address address);
    @Mapping(target = "hotelId", source = "hotel.id")
    @Mapping(target = "districtId", source = "district.id")
    ListAddressResponse addressToGetAllAddressResponses(Address address);
    @Mapping(target = "hotelId", source = "hotel.id")
    @Mapping(target = "districtId", source = "district.id")
    GetByIdAddressResponse addressToGetByIdAddressResponse(Address address);
}
