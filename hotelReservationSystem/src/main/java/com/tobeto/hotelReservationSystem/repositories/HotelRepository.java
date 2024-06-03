package com.tobeto.hotelReservationSystem.repositories;

import com.tobeto.hotelReservationSystem.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {
}
