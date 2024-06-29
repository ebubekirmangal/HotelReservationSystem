package com.tobeto.hotelReservationSystem.entities.addresses;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "districts")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String name;

    @OneToOne
    @JoinColumn(name="city_id")
    private City city;
}
