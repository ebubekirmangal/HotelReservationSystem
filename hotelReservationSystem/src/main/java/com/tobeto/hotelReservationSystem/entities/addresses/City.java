package com.tobeto.hotelReservationSystem.entities.addresses;

import com.tobeto.hotelReservationSystem.entities.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name = "cities")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String name;

    @OneToOne(mappedBy= "city")
    private District district;

    @OneToMany(mappedBy = "city")
    private List<Address> addresses;
}
