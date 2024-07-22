package com.tobeto.hotelReservationSystem.repositories;

import com.tobeto.hotelReservationSystem.entities.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback,Integer> {
    List<Feedback> findAllByOrderByDateDesc();
}
