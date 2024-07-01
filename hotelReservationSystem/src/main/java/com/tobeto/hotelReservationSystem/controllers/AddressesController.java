package com.tobeto.hotelReservationSystem.controllers;

import com.tobeto.hotelReservationSystem.services.abstracts.AddressService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.address.AddAddressRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.address.UpdateAddressRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.address.AddAddressResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.address.GetByIdAddressResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.address.ListAddressResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.address.UpdateAddressResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/address")
public class AddressesController {
    private final AddressService addressService;
    @PostMapping ("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public AddAddressResponse add(@RequestBody AddAddressRequest request){
        return addressService.add(request);
    }
    @PutMapping("/update")
    public UpdateAddressResponse update(@RequestBody UpdateAddressRequest request){
        return addressService.update(request);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable ("id") int id){
        addressService.delete(id);
    }
    @GetMapping("/getAll")
    public List<ListAddressResponse> getAll(){
        return addressService.getAll();
    }
    @GetMapping("/getById/{id}")
    public GetByIdAddressResponse getById(@PathVariable("id") int id){
        return addressService.getById(id);
    }
}