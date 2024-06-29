package com.tobeto.hotelReservationSystem.entities;

import com.tobeto.hotelReservationSystem.entities.enums.HousingType;
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

    @Column(name = "phone_number")
    private String phoneNumber;

    private String email;

    private int rating;

    private List<String> images;

    @Enumerated(EnumType.STRING)
    private HousingType housingType;

    @OneToMany(mappedBy = "hotel")
    private List<Room> rooms;

    @OneToMany(mappedBy = "hotel")
    private List<Reservation> reservations;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
}
