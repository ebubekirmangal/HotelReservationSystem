package com.tobeto.hotelReservationSystem.entities;

import com.tobeto.hotelReservationSystem.entities.enums.AccommodationType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

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

    private double rating;

    private int star;

    @Enumerated(EnumType.STRING)
    private AccommodationType accommodationType;

    @OneToMany(mappedBy = "hotel")
    private List<Room> rooms;

    @OneToMany(mappedBy = "hotel")
    private List<Reservation> reservations;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "hotel_features",joinColumns = @JoinColumn(name = "hotel_id"),inverseJoinColumns = @JoinColumn(name = "feature_id"))
    private Set<Feature> features;

    @OneToMany(mappedBy = "hotel")
    private List<Image>images;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}
