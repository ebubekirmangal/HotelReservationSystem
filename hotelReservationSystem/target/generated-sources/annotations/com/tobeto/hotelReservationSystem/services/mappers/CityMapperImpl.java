package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.addresses.City;
import com.tobeto.hotelReservationSystem.services.dtos.responses.city.GetAllCityResponse;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-04T23:10:25+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.3 (Oracle Corporation)"
)
public class CityMapperImpl implements CityMapper {

    @Override
    public GetAllCityResponse CityToGetAllCityResponse(City city) {
        if ( city == null ) {
            return null;
        }

        GetAllCityResponse getAllCityResponse = new GetAllCityResponse();

        getAllCityResponse.setId( city.getId() );
        getAllCityResponse.setName( city.getName() );

        return getAllCityResponse;
    }
}
