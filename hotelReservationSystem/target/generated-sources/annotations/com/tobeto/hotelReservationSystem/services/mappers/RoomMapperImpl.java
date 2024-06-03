package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Hotel;
import com.tobeto.hotelReservationSystem.entities.Room;
import com.tobeto.hotelReservationSystem.services.dtos.requests.room.AddRoomRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.room.UpdateRoomRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.AddRoomResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.GetByIdRoomResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.ListRoomResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.UpdateRoomResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-04T00:37:37+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class RoomMapperImpl implements RoomMapper {

    @Override
    public Room addRoomRequestToRoom(AddRoomRequest request) {
        if ( request == null ) {
            return null;
        }

        Room room = new Room();

        room.setHotel( addRoomRequestToHotel( request ) );
        room.setCapacity( request.getCapacity() );
        room.setPrice( request.getPrice() );
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
        addRoomResponse.setRoomNumber( room.getRoomNumber() );
        addRoomResponse.setCapacity( room.getCapacity() );
        addRoomResponse.setPrice( room.getPrice() );

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
        updateRoomResponse.setRoomNumber( room.getRoomNumber() );
        updateRoomResponse.setCapacity( room.getCapacity() );
        updateRoomResponse.setPrice( room.getPrice() );

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
        getByIdRoomResponse.setRoomNumber( room.getRoomNumber() );
        getByIdRoomResponse.setCapacity( room.getCapacity() );
        getByIdRoomResponse.setPrice( room.getPrice() );

        return getByIdRoomResponse;
    }

    @Override
    public List<ListRoomResponse> roomsToGetAllRoomResponses(List<Room> rooms) {
        if ( rooms == null ) {
            return null;
        }

        List<ListRoomResponse> list = new ArrayList<ListRoomResponse>( rooms.size() );
        for ( Room room : rooms ) {
            list.add( roomToListRoomResponse( room ) );
        }

        return list;
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

    protected ListRoomResponse roomToListRoomResponse(Room room) {
        if ( room == null ) {
            return null;
        }

        ListRoomResponse listRoomResponse = new ListRoomResponse();

        listRoomResponse.setId( room.getId() );
        listRoomResponse.setRoomType( room.getRoomType() );
        listRoomResponse.setRoomNumber( room.getRoomNumber() );
        listRoomResponse.setCapacity( room.getCapacity() );
        listRoomResponse.setPrice( room.getPrice() );

        return listRoomResponse;
    }
}
