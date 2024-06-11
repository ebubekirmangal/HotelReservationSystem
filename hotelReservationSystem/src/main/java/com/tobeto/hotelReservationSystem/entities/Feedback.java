package com.tobeto.hotelReservationSystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String content;

    private int rating;

    private LocalDateTime date;

    @ManyToOne
    private User user;

    @ManyToOne
    private Reservation reservation;

    @OneToMany(mappedBy = "feedback")
    private List<Reply> replies;
}