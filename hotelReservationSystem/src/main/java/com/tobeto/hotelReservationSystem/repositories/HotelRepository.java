package com.tobeto.hotelReservationSystem.repositories;

import com.tobeto.hotelReservationSystem.entities.Hotel;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.HotelDetailsResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {
//    @Query(value = "Select new com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.ListHotelRoomResponse(h.name,r.price,h.rating)" +
//            "FROM Hotel h " + "JOIN Room r ON h.id = r.hotel.id" +
//            "WHERE r.price < :price AND h.rating > :rating", nativeQuery = false)
//    List<ListHotelRoomResponse> findHotelsWithPriceAndRating(@Param("price") Double price, @Param("rating") Integer rating);

    @Query("SELECT new com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.HotelDetailsResponse(h.name, a.city, rs.checkInDate, rs.checkOutDate) " +
            "FROM Hotel h " +
            "JOIN h.address a " +
            "JOIN h.reservations rs " +
            "JOIN h.rooms r " +
            "WHERE a.city = :city AND rs.checkInDate = :checkInDate AND rs.checkOutDate = :checkOutDate AND r.available = true " +
            "ORDER BY h.id ASC")
    List<HotelDetailsResponse> findHotelsByCityAndDates(@Param("city") String city,
                                                        @Param("checkInDate") LocalDate checkInDate,
                                                        @Param("checkOutDate") LocalDate checkOutDate);


}



