package com.tobeto.hotelReservationSystem.entities;

import com.tobeto.hotelReservationSystem.entities.enums.RoomType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

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

//    @Column(name = "room_number")
//    private String roomNumber;

    private int capacity;

    private double price;

    private String title;

    private Boolean available;

    public boolean isAvailable() {
        return available;
    }

    @Enumerated(EnumType.STRING)
    private RoomType roomType;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    @OneToMany(mappedBy = "room")
    private List<Reservation> reservations;

    @ElementCollection
    @OneToMany(mappedBy = "room")
    private List<Image> images;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "room_features",
            joinColumns = @JoinColumn(name = "room_id"),
            inverseJoinColumns = @JoinColumn(name = "feature_id")
    )
    private Set<Feature> features;



}
