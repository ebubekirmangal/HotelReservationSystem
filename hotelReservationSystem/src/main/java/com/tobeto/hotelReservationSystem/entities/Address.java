package com.tobeto.hotelReservationSystem.entities;

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

    private String country;

    private String city;

   private String district;

   private String street;

   private String zipCode;

   @OneToOne(mappedBy = "address")
    private Hotel hotel;

   //TODO: service ımpl ve mapper oluştur.
}
