package com.tobeto.hotelReservationSystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name = "hotels")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String address;

    @Column(name = "phone_number")
    private String phoneNumber;

    private String email;

    @OneToMany(mappedBy = "hotel")
    private List<Room> rooms;

    @OneToMany(mappedBy = "hotel")
    private List<Reservation> reservations;
}
