package com.tobeto.hotelReservationSystem.entities;

import com.tobeto.hotelReservationSystem.entities.enums.RoomType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name = "rooms")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "room_number")
    private String roomNumber;

    private int capacity;

    private double price;

    private Boolean available;

    @Enumerated(EnumType.STRING)
    private RoomType type;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    @OneToMany(mappedBy = "room")
    private List<Reservation> reservations;
}
