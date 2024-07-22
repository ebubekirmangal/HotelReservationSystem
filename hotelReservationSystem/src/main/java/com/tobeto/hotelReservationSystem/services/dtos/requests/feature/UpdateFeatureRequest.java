package com.tobeto.hotelReservationSystem.services.dtos.requests.feature;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateFeatureRequest {

    private int id;

    private String name;

    private Set<Integer> hotelIds;

    private Set<Integer> roomIds;
}