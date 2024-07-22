package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Feature;
import com.tobeto.hotelReservationSystem.services.dtos.requests.feature.AddFeatureRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.feature.UpdateFeatureRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.feature.ListFeatureResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-22T18:46:10+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class FeatureMapperImpl implements FeatureMapper {

    @Override
    public Feature featureToAddFeatureRequest(AddFeatureRequest request) {
        if ( request == null ) {
            return null;
        }

        Feature feature = new Feature();

        feature.setHotels( mapHotelIdsToHotels( request.getHotelIds() ) );
        feature.setRooms( mapRoomIdsToRooms( request.getRoomIds() ) );
        feature.setName( request.getName() );

        return feature;
    }

    @Override
    public Feature featureToUpdateFeatureRequest(UpdateFeatureRequest request) {
        if ( request == null ) {
            return null;
        }

        Feature feature = new Feature();

        feature.setHotels( mapHotelIdsToHotels( request.getHotelIds() ) );
        feature.setRooms( mapRoomIdsToRooms( request.getRoomIds() ) );
        feature.setId( request.getId() );
        feature.setName( request.getName() );

        return feature;
    }

    @Override
    public ListFeatureResponse ListFeatureResponseToFeature(Feature feature) {
        if ( feature == null ) {
            return null;
        }

        ListFeatureResponse listFeatureResponse = new ListFeatureResponse();

        listFeatureResponse.setHotelIds( mapHotelsToHotelIds( feature.getHotels() ) );
        listFeatureResponse.setRoomIds( mapRoomsToRoomIds( feature.getRooms() ) );
        listFeatureResponse.setId( feature.getId() );
        if ( feature.getFeatureType() != null ) {
            listFeatureResponse.setFeatureType( feature.getFeatureType().name() );
        }
        listFeatureResponse.setName( feature.getName() );

        return listFeatureResponse;
    }

    @Override
    public List<ListFeatureResponse> ListFeatureResponseToFeature(List<Feature> features) {
        if ( features == null ) {
            return null;
        }

        List<ListFeatureResponse> list = new ArrayList<ListFeatureResponse>( features.size() );
        for ( Feature feature : features ) {
            list.add( ListFeatureResponseToFeature( feature ) );
        }

        return list;
    }
}
