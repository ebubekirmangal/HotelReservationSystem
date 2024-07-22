package com.tobeto.hotelReservationSystem.repositories;

import com.tobeto.hotelReservationSystem.entities.Feature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeatureRepository extends JpaRepository<Feature,Integer> {
}
