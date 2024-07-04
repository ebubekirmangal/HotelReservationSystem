package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.addresses.District;
import com.tobeto.hotelReservationSystem.services.dtos.responses.district.GetAllByCityIdResponse;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-04T23:10:25+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.3 (Oracle Corporation)"
)
public class DistrictMapperImpl implements DistrictMapper {

    @Override
    public GetAllByCityIdResponse districtToGetAllByCityIdResponse(District district) {
        if ( district == null ) {
            return null;
        }

        GetAllByCityIdResponse getAllByCityIdResponse = new GetAllByCityIdResponse();

        getAllByCityIdResponse.setId( district.getId() );
        getAllByCityIdResponse.setName( district.getName() );

        return getAllByCityIdResponse;
    }
}
