package com.tobeto.hotelReservationSystem.entities;

import com.tobeto.hotelReservationSystem.entities.enums.FeatureType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Table(name = "features")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Feature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Enumerated(EnumType.STRING)
    private FeatureType featureType;

    @ManyToMany(mappedBy = "features")
    private Set<Hotel> hotels = new HashSet<>();

    @ManyToMany(mappedBy = "features")
    private Set<Room> rooms = new HashSet<>();
}
