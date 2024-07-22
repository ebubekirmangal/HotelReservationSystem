package com.tobeto.hotelReservationSystem.services.dtos.responses.feature;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ListFeatureResponse {

    private int id;

    private String featureType;

    private Set<Integer> hotelIds;

    private Set<Integer> roomIds;

    private String name;
}