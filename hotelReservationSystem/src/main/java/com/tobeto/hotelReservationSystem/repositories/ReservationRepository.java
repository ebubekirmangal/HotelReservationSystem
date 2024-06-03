package com.tobeto.hotelReservationSystem.repositories;

import com.tobeto.hotelReservationSystem.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Integer> {
}
