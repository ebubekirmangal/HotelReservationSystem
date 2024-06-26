package com.tobeto.hotelReservationSystem.services.concretes;

import com.tobeto.hotelReservationSystem.core.utils.exceptions.types.BusinessException;
import com.tobeto.hotelReservationSystem.entities.Address;
import com.tobeto.hotelReservationSystem.repositories.AddressRepository;
import com.tobeto.hotelReservationSystem.services.abstracts.AddressService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.address.AddAddressRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.address.UpdateAddressRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.address.AddAddressResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.address.GetByIdAddressResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.address.ListAddressResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.address.UpdateAddressResponse;
import com.tobeto.hotelReservationSystem.services.mappers.AddressMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository;
    @Override
    public AddAddressResponse add(AddAddressRequest request) {
        Address address = AddressMapper.INSTANCE.addAddressRequestToAddress(request);
        Address saved = addressRepository.save(address);
        AddAddressResponse response = AddressMapper.INSTANCE.addressToAddAddressResponse(saved);
        return response;
    }

    @Override
    public UpdateAddressResponse update(UpdateAddressRequest request) {
        Address address = AddressMapper.INSTANCE.updateAddressRequestToAddress(request);
        Address updated = addressRepository.save(address);
        UpdateAddressResponse response = AddressMapper.INSTANCE.addressToUpdateAddressResponse(updated);
        return response;
    }

    @Override
    public void delete(int id) {
       Address address = addressRepository.findById(id)
               .orElseThrow(() -> new BusinessException("Address not found"));
       addressRepository.deleteById(id);
    }

    @Override
    public List<ListAddressResponse> getAll() {
        List<Address> addresses = addressRepository.findAll();
        List<ListAddressResponse> result = new ArrayList<>();
        for(Address address:addresses){

            ListAddressResponse dto = AddressMapper.INSTANCE.addressToGetAllAddressResponses(address);
            result.add(dto);
        }

        return result;
    }

    @Override
    public GetByIdAddressResponse getById(int id) {
        Address address = addressRepository.findById(id).orElseThrow();
        GetByIdAddressResponse response = AddressMapper.INSTANCE.addressToGetByIdAddressResponse(address);
        return response;
    }
}
