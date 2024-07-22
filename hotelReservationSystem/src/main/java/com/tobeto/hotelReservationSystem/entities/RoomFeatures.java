package com.tobeto.hotelReservationSystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "room_features")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoomFeatures {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @ManyToOne
    @JoinColumn(name = "feature_id")
    private Feature feature;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;
}