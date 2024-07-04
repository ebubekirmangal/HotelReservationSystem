package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Feature;
import com.tobeto.hotelReservationSystem.entities.Hotel;
import com.tobeto.hotelReservationSystem.entities.Image;
import com.tobeto.hotelReservationSystem.entities.Room;
import com.tobeto.hotelReservationSystem.services.dtos.requests.room.AddRoomRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.room.UpdateRoomRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.AddRoomResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.GetAllRoomByHotelIdResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.GetByIdRoomResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.ListRoomResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.UpdateRoomResponse;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-04T23:10:24+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.3 (Oracle Corporation)"
)
public class RoomMapperImpl implements RoomMapper {

    @Override
    public Room addRoomRequestToRoom(AddRoomRequest request) {
        if ( request == null ) {
            return null;
        }

        Room room = new Room();

        room.setHotel( addRoomRequestToHotel( request ) );
        List<Image> list = request.getImageIds();
        if ( list != null ) {
            room.setImages( new ArrayList<Image>( list ) );
        }
        List<Feature> list1 = request.getFeatureIds();
        if ( list1 != null ) {
            room.setFeatures( new LinkedHashSet<Feature>( list1 ) );
        }
        room.setCapacity( request.getCapacity() );
        room.setPrice( request.getPrice() );
        room.setTitle( request.getTitle() );
        room.setRoomType( request.getRoomType() );

        return room;
    }

    @Override
    public Room updateRoomRequestToRoom(UpdateRoomRequest request) {
        if ( request == null ) {
            return null;
        }

        Room room = new Room();

        room.setHotel( updateRoomRequestToHotel( request ) );
        room.setId( request.getId() );
        room.setCapacity( request.getCapacity() );
        room.setPrice( request.getPrice() );
        room.setAvailable( request.isAvailable() );
        room.setRoomType( request.getRoomType() );

        return room;
    }

    @Override
    public AddRoomResponse roomToAddRoomResponse(Room room) {
        if ( room == null ) {
            return null;
        }

        AddRoomResponse addRoomResponse = new AddRoomResponse();

        addRoomResponse.setHotelName( roomHotelName( room ) );
        addRoomResponse.setId( room.getId() );
        addRoomResponse.setRoomType( room.getRoomType() );
        addRoomResponse.setCapacity( room.getCapacity() );
        addRoomResponse.setPrice( room.getPrice() );
        if ( room.getAvailable() != null ) {
            addRoomResponse.setAvailable( room.getAvailable() );
        }

        return addRoomResponse;
    }

    @Override
    public UpdateRoomResponse roomToUpdateRoomResponse(Room room) {
        if ( room == null ) {
            return null;
        }

        UpdateRoomResponse updateRoomResponse = new UpdateRoomResponse();

        updateRoomResponse.setHotelName( roomHotelName( room ) );
        updateRoomResponse.setId( room.getId() );
        updateRoomResponse.setRoomType( room.getRoomType() );
        updateRoomResponse.setCapacity( room.getCapacity() );
        updateRoomResponse.setPrice( room.getPrice() );
        if ( room.getAvailable() != null ) {
            updateRoomResponse.setAvailable( room.getAvailable() );
        }

        return updateRoomResponse;
    }

    @Override
    public GetByIdRoomResponse roomToGetByIdRoomResponse(Room room) {
        if ( room == null ) {
            return null;
        }

        GetByIdRoomResponse getByIdRoomResponse = new GetByIdRoomResponse();

        getByIdRoomResponse.setHotelName( roomHotelName( room ) );
        getByIdRoomResponse.setId( room.getId() );
        getByIdRoomResponse.setRoomType( room.getRoomType() );
        getByIdRoomResponse.setCapacity( room.getCapacity() );
        getByIdRoomResponse.setPrice( room.getPrice() );
        if ( room.getAvailable() != null ) {
            getByIdRoomResponse.setAvailable( room.getAvailable() );
        }

        return getByIdRoomResponse;
    }

    @Override
    public ListRoomResponse roomsToGetAllRoomResponses(Room room) {
        if ( room == null ) {
            return null;
        }

        ListRoomResponse listRoomResponse = new ListRoomResponse();

        listRoomResponse.setImageIds( map( room.getImages() ) );
        listRoomResponse.setFeatureIds( mapFeaturesToFeatureIds( room.getFeatures() ) );
        listRoomResponse.setHotelName( roomHotelName( room ) );
        listRoomResponse.setId( room.getId() );
        listRoomResponse.setRoomType( room.getRoomType() );
        listRoomResponse.setCapacity( room.getCapacity() );
        listRoomResponse.setPrice( room.getPrice() );
        if ( room.getAvailable() != null ) {
            listRoomResponse.setAvailable( room.getAvailable() );
        }

        return listRoomResponse;
    }

    @Override
    public GetAllRoomByHotelIdResponse roomsToGetAllRoomByHotelIdResponse(Room room) {
        if ( room == null ) {
            return null;
        }

        GetAllRoomByHotelIdResponse getAllRoomByHotelIdResponse = new GetAllRoomByHotelIdResponse();

        getAllRoomByHotelIdResponse.setId( room.getId() );
        getAllRoomByHotelIdResponse.setRoomType( room.getRoomType() );
        getAllRoomByHotelIdResponse.setCapacity( room.getCapacity() );
        getAllRoomByHotelIdResponse.setTitle( room.getTitle() );
        getAllRoomByHotelIdResponse.setPrice( room.getPrice() );
        if ( room.getAvailable() != null ) {
            getAllRoomByHotelIdResponse.setAvailable( room.getAvailable() );
        }

        return getAllRoomByHotelIdResponse;
    }

    protected Hotel addRoomRequestToHotel(AddRoomRequest addRoomRequest) {
        if ( addRoomRequest == null ) {
            return null;
        }

        Hotel hotel = new Hotel();

        hotel.setId( addRoomRequest.getHotelId() );

        return hotel;
    }

    protected Hotel updateRoomRequestToHotel(UpdateRoomRequest updateRoomRequest) {
        if ( updateRoomRequest == null ) {
            return null;
        }

        Hotel hotel = new Hotel();

        hotel.setId( updateRoomRequest.getHotelId() );

        return hotel;
    }

    private String roomHotelName(Room room) {
        Hotel hotel = room.getHotel();
        if ( hotel == null ) {
            return null;
        }
        return hotel.getName();
    }
}
