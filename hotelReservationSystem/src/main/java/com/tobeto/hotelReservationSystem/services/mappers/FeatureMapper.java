package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Feature;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Mapper
public interface FeatureMapper {
    default List<Integer> mapFeaturesToFeatureIds(Set<Feature> features) {
        if (features == null) {
            return null;
        }
        return features.stream()
                .map(Feature::getId)
                .collect(Collectors.toList());
    }
}
