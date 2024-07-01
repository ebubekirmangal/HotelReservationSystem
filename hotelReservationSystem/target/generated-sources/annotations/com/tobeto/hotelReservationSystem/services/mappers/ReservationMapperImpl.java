package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Hotel;
import com.tobeto.hotelReservationSystem.entities.Reservation;
import com.tobeto.hotelReservationSystem.entities.Room;
import com.tobeto.hotelReservationSystem.entities.User;
import com.tobeto.hotelReservationSystem.entities.enums.RoomType;
import com.tobeto.hotelReservationSystem.services.dtos.requests.reservation.AddReservationRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.reservation.UpdateReservationRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reservation.AddReservationResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reservation.GetByIdReservationResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reservation.ListReservationResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reservation.UpdateReservationResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-30T15:19:17+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class ReservationMapperImpl implements ReservationMapper {

    @Override
    public Reservation reservationToAddReservationRequest(AddReservationRequest addReservationRequest) {
        if ( addReservationRequest == null ) {
            return null;
        }

        Reservation reservation = new Reservation();

        reservation.setHotel( addReservationRequestToHotel( addReservationRequest ) );
        reservation.setUser( addReservationRequestToUser( addReservationRequest ) );
        reservation.setRoom( addReservationRequestToRoom( addReservationRequest ) );
        reservation.setCheckInDate( addReservationRequest.getCheckInDate() );
        reservation.setCheckOutDate( addReservationRequest.getCheckOutDate() );

        return reservation;
    }

    @Override
    public AddReservationResponse addReservationResponseToReservation(Reservation reservation) {
        if ( reservation == null ) {
            return null;
        }

        AddReservationResponse addReservationResponse = new AddReservationResponse();

        addReservationResponse.setHotelId( reservationHotelId( reservation ) );
        addReservationResponse.setUserId( reservationUserId( reservation ) );
        addReservationResponse.setRoomId( reservationRoomId( reservation ) );
        addReservationResponse.setId( reservation.getId() );
        addReservationResponse.setCheckInDate( reservation.getCheckInDate() );
        addReservationResponse.setCheckOutDate( reservation.getCheckOutDate() );
        addReservationResponse.setReservationStatus( reservation.getReservationStatus() );
        addReservationResponse.setTotalPrice( reservation.getTotalPrice() );

        return addReservationResponse;
    }

    @Override
    public Reservation reservationToUpdateReservationRequest(UpdateReservationRequest updateReservationRequest) {
        if ( updateReservationRequest == null ) {
            return null;
        }

        Reservation reservation = new Reservation();

        reservation.setHotel( updateReservationRequestToHotel( updateReservationRequest ) );
        reservation.setUser( updateReservationRequestToUser( updateReservationRequest ) );
        reservation.setRoom( updateReservationRequestToRoom( updateReservationRequest ) );
        reservation.setId( updateReservationRequest.getId() );
        reservation.setCheckInDate( updateReservationRequest.getCheckInDate() );
        reservation.setCheckOutDate( updateReservationRequest.getCheckOutDate() );
        reservation.setReservationStatus( updateReservationRequest.getReservationStatus() );

        return reservation;
    }

    @Override
    public UpdateReservationResponse updateReservationResponseToReservation(Reservation reservation) {
        if ( reservation == null ) {
            return null;
        }

        UpdateReservationResponse updateReservationResponse = new UpdateReservationResponse();

        updateReservationResponse.setHotelId( reservationHotelId( reservation ) );
        updateReservationResponse.setUserId( reservationUserId( reservation ) );
        updateReservationResponse.setRoomId( reservationRoomId( reservation ) );
        updateReservationResponse.setCheckInDate( reservation.getCheckInDate() );
        updateReservationResponse.setCheckOutDate( reservation.getCheckOutDate() );

        return updateReservationResponse;
    }

    @Override
    public ListReservationResponse getAllReservationResponseToReservation(Reservation reservation) {
        if ( reservation == null ) {
            return null;
        }

        ListReservationResponse listReservationResponse = new ListReservationResponse();

        listReservationResponse.setRoomId( reservationRoomId( reservation ) );
        RoomType roomType = reservationRoomRoomType( reservation );
        if ( roomType != null ) {
            listReservationResponse.setRoomType( roomType.name() );
        }
        listReservationResponse.setUserId( reservationUserId( reservation ) );
        listReservationResponse.setHotelId( reservationHotelId( reservation ) );
        listReservationResponse.setId( reservation.getId() );
        listReservationResponse.setCheckInDate( reservation.getCheckInDate() );
        listReservationResponse.setCheckOutDate( reservation.getCheckOutDate() );

        return listReservationResponse;
    }

    @Override
    public GetByIdReservationResponse getByIdReservationResponseToReservation(Reservation reservation) {
        if ( reservation == null ) {
            return null;
        }

        GetByIdReservationResponse getByIdReservationResponse = new GetByIdReservationResponse();

        getByIdReservationResponse.setRoomId( reservationRoomId( reservation ) );
        RoomType roomType = reservationRoomRoomType( reservation );
        if ( roomType != null ) {
            getByIdReservationResponse.setRoomType( roomType.name() );
        }
        getByIdReservationResponse.setUserId( reservationUserId( reservation ) );
        getByIdReservationResponse.setHotelId( reservationHotelId( reservation ) );
        getByIdReservationResponse.setId( reservation.getId() );
        getByIdReservationResponse.setCheckInDate( reservation.getCheckInDate() );
        getByIdReservationResponse.setCheckOutDate( reservation.getCheckOutDate() );

        return getByIdReservationResponse;
    }

    @Override
    public List<GetByIdReservationResponse> getByUserReservationResponseToReservation(List<Reservation> reservations) {
        if ( reservations == null ) {
            return null;
        }

        List<GetByIdReservationResponse> list = new ArrayList<GetByIdReservationResponse>( reservations.size() );
        for ( Reservation reservation : reservations ) {
            list.add( getByIdReservationResponseToReservation( reservation ) );
        }

        return list;
    }

    protected Hotel addReservationRequestToHotel(AddReservationRequest addReservationRequest) {
        if ( addReservationRequest == null ) {
            return null;
        }

        Hotel hotel = new Hotel();

        hotel.setId( addReservationRequest.getHotelId() );

        return hotel;
    }

    protected User addReservationRequestToUser(AddReservationRequest addReservationRequest) {
        if ( addReservationRequest == null ) {
            return null;
        }

        User user = new User();

        user.setId( addReservationRequest.getUserId() );

        return user;
    }

    protected Room addReservationRequestToRoom(AddReservationRequest addReservationRequest) {
        if ( addReservationRequest == null ) {
            return null;
        }

        Room room = new Room();

        room.setId( addReservationRequest.getRoomId() );

        return room;
    }

    private int reservationHotelId(Reservation reservation) {
        Hotel hotel = reservation.getHotel();
        if ( hotel == null ) {
            return 0;
        }
        return hotel.getId();
    }

    private int reservationUserId(Reservation reservation) {
        User user = reservation.getUser();
        if ( user == null ) {
            return 0;
        }
        return user.getId();
    }

    private int reservationRoomId(Reservation reservation) {
        Room room = reservation.getRoom();
        if ( room == null ) {
            return 0;
        }
        return room.getId();
    }

    protected Hotel updateReservationRequestToHotel(UpdateReservationRequest updateReservationRequest) {
        if ( updateReservationRequest == null ) {
            return null;
        }

        Hotel hotel = new Hotel();

        hotel.setId( updateReservationRequest.getHotelId() );

        return hotel;
    }

    protected User updateReservationRequestToUser(UpdateReservationRequest updateReservationRequest) {
        if ( updateReservationRequest == null ) {
            return null;
        }

        User user = new User();

        user.setId( updateReservationRequest.getUserId() );

        return user;
    }

    protected Room updateReservationRequestToRoom(UpdateReservationRequest updateReservationRequest) {
        if ( updateReservationRequest == null ) {
            return null;
        }

        Room room = new Room();

        room.setId( updateReservationRequest.getRoomId() );

        return room;
    }

    private RoomType reservationRoomRoomType(Reservation reservation) {
        Room room = reservation.getRoom();
        if ( room == null ) {
            return null;
        }
        return room.getRoomType();
    }
}
