package com.tobeto.hotelReservationSystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Feedback feedback;

    @ManyToOne
    private User user; //TODO: Authentication kısmında yetkilendirme ile sadece otel yöneticileri cevap verebilecek.

    private String content;

    private LocalDateTime date;
}