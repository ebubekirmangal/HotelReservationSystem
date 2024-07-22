package com.tobeto.hotelReservationSystem.services.abstracts;

import com.tobeto.hotelReservationSystem.entities.Feature;
import com.tobeto.hotelReservationSystem.services.dtos.requests.feature.AddFeatureRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.feature.UpdateFeatureRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.feature.ListFeatureResponse;

import java.util.List;

public interface FeatureService {

    Feature add(AddFeatureRequest request);

    Feature update(UpdateFeatureRequest request);

    void delete(int id);

    List<ListFeatureResponse> getAll();
}