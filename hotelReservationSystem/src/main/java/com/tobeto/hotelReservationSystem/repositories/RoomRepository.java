package com.tobeto.hotelReservationSystem.repositories;

import com.tobeto.hotelReservationSystem.entities.Room;
import com.tobeto.hotelReservationSystem.entities.enums.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Integer> {
    //TODO: Room tablosundaki oda durumunu değiştirmiyor.
    @Query("SELECT r FROM Room r WHERE r.available = true AND r.roomType = :roomType " +
            "AND NOT EXISTS (SELECT rv FROM Reservation rv WHERE rv.room = r AND (:startDate BETWEEN rv.checkInDate AND rv.checkOutDate) " +
            "OR (:endDate BETWEEN rv.checkInDate AND rv.checkOutDate))")
    List<Room> findAvailableRooms(@Param("startDate") LocalDate startDate,
                                  @Param("endDate") LocalDate endDate,
                                  @Param("roomType")RoomType roomType);
}
