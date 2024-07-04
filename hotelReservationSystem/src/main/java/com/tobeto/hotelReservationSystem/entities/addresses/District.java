package com.tobeto.hotelReservationSystem.entities.addresses;

import com.tobeto.hotelReservationSystem.entities.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

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

    @ManyToOne
    @JoinColumn(name="city_id")
    private City city;

    @OneToMany(mappedBy = "district")
    private List<Address> addresses;
}
