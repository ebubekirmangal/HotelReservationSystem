package com.tobeto.hotelReservationSystem.entities;

import com.tobeto.hotelReservationSystem.entities.addresses.City;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "addresses")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

   // private String country;

   // private String street;

    private String description;

   // private String zipCode;

    @OneToOne(mappedBy = "address")
    private Hotel hotel;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;


}