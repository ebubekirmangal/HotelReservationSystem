package com.tobeto.hotelReservationSystem.repositories;

import com.tobeto.hotelReservationSystem.entities.Hotel;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.ListHotelRoomResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {

    @Query(value = "Select new com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.ListHotelRoomResponse(h.name,r.price,h.rating)" +
            "FROM Hotel h " + "JOIN Room r ON h.id = r.hotel.id" +
            "WHERE r.price < :price AND h.rating > :rating", nativeQuery = false)
    List<ListHotelRoomResponse> findHotelsWithPriceAndRating(@Param("price") Double price, @Param("rating") Integer rating);

}

