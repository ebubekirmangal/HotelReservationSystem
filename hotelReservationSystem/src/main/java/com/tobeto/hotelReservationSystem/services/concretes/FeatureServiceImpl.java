package com.tobeto.hotelReservationSystem.services.concretes;

import com.tobeto.hotelReservationSystem.entities.Feature;
import com.tobeto.hotelReservationSystem.entities.Hotel;
import com.tobeto.hotelReservationSystem.entities.Room;
import com.tobeto.hotelReservationSystem.repositories.FeatureRepository;
import com.tobeto.hotelReservationSystem.repositories.HotelRepository;
import com.tobeto.hotelReservationSystem.repositories.RoomRepository;
import com.tobeto.hotelReservationSystem.services.abstracts.FeatureService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.feature.AddFeatureRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.feature.UpdateFeatureRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.feature.ListFeatureResponse;
import com.tobeto.hotelReservationSystem.services.mappers.FeatureMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class FeatureServiceImpl implements FeatureService {

    private final FeatureRepository featureRepository;
    private final HotelRepository hotelRepository;
    private final RoomRepository roomRepository;

    @Override
    public Feature add(AddFeatureRequest request) {
        Feature feature = FeatureMapper.INSTANCE.featureToAddFeatureRequest(request);

        if (request.getHotelIds() != null) {
            Set<Hotel> hotels = new HashSet<>(hotelRepository.findAllById(request.getHotelIds()));
            feature.getHotels().addAll(hotels);
        }

        if (request.getRoomIds() != null) {
            Set<Room> rooms = new HashSet<>(roomRepository.findAllById(request.getRoomIds()));
            feature.getRooms().addAll(rooms);
        }

        return featureRepository.save(feature);
    }

    @Override
    public Feature update(UpdateFeatureRequest request) {
        Feature existingFeature = featureRepository.findById(request.getId())
                .orElseThrow(() -> new RuntimeException("Feature not found"));

        Feature updatedFeature = FeatureMapper.INSTANCE.featureToUpdateFeatureRequest(request);

        updatedFeature.setId(existingFeature.getId()); // Ensure the ID is set correctly

        return featureRepository.save(updatedFeature);
    }

    @Override
    public void delete(int id) {
        Feature feature = featureRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Feature not found"));
        featureRepository.delete(feature);
    }

    @Override
    public List<ListFeatureResponse> getAll() {
        List<Feature> featureList = featureRepository.findAll();
        List<ListFeatureResponse> result = new ArrayList<>();
        for (Feature feature : featureList){
            ListFeatureResponse dto = FeatureMapper.INSTANCE.ListFeatureResponseToFeature(feature);
            result.add(dto);
        }
        return result;
    }
}