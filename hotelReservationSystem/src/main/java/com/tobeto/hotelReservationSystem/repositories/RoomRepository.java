package com.tobeto.hotelReservationSystem.repositories;

import com.tobeto.hotelReservationSystem.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Integer> {
}
