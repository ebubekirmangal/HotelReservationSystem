package com.tobeto.hotelReservationSystem.services.abstracts;

import com.tobeto.hotelReservationSystem.services.dtos.requests.address.AddAddressRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.address.UpdateAddressRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.address.AddAddressResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.address.GetByIdAddressResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.address.ListAddressResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.address.UpdateAddressResponse;

import java.util.List;

public interface AddressService {
    AddAddressResponse add(AddAddressRequest request);

    UpdateAddressResponse update(UpdateAddressRequest request);

    void delete(int id);

    List<ListAddressResponse> getAll();

    GetByIdAddressResponse getById(int id);
}
