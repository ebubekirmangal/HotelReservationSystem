package com.tobeto.hotelReservationSystem.services.concretes;

import com.tobeto.hotelReservationSystem.entities.addresses.District;
import com.tobeto.hotelReservationSystem.repositories.DistrictRepository;
import com.tobeto.hotelReservationSystem.services.abstracts.DistrictService;
import com.tobeto.hotelReservationSystem.services.dtos.responses.district.GetAllByCityIdResponse;
import com.tobeto.hotelReservationSystem.services.mappers.DistrictMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DistrictServiceImpl implements DistrictService {

    private final DistrictRepository districtRepository;
    @Override
    public List<GetAllByCityIdResponse> getAllByCityId(int cityId ) {
        List<District> districts = districtRepository.findByCityId(cityId);
        List<GetAllByCityIdResponse> result = new ArrayList<>();
        for(District district:districts){
            GetAllByCityIdResponse dto = DistrictMapper.INSTANCE.districtToGetAllByCityIdResponse(district);
            result.add(dto);
        }
        return result;
    }
}
