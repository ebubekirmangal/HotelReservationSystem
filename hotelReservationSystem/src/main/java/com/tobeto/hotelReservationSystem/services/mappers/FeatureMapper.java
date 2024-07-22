package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Feature;
import com.tobeto.hotelReservationSystem.entities.Hotel;
import com.tobeto.hotelReservationSystem.entities.Room;
import com.tobeto.hotelReservationSystem.services.dtos.requests.feature.AddFeatureRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.feature.UpdateFeatureRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.feature.ListFeatureResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Mapper
public interface FeatureMapper {
    FeatureMapper INSTANCE = Mappers.getMapper(FeatureMapper.class);

    @Mapping(target = "hotels", source = "hotelIds", qualifiedByName = "mapHotelIdsToHotels")
    @Mapping(target = "rooms", source = "roomIds", qualifiedByName = "mapRoomIdsToRooms")
    Feature featureToAddFeatureRequest(AddFeatureRequest request);

    @Mapping(target = "hotels", source = "hotelIds", qualifiedByName = "mapHotelIdsToHotels")
    @Mapping(target = "rooms", source = "roomIds", qualifiedByName = "mapRoomIdsToRooms")
    Feature featureToUpdateFeatureRequest(UpdateFeatureRequest request);

    @Mapping(target = "hotelIds", source = "hotels", qualifiedByName = "mapHotelsToHotelIds")
    @Mapping(target = "roomIds", source = "rooms", qualifiedByName = "mapRoomsToRoomIds")
    ListFeatureResponse ListFeatureResponseToFeature(Feature feature);

    List<ListFeatureResponse> ListFeatureResponseToFeature(List<Feature> features);

    default List<Integer> mapFeaturesToFeatureIds(Set<Feature> features) {
        if (features == null) {
            return null;
        }
        return features.stream()
                .map(Feature::getId)
                .collect(Collectors.toList());
    }

    @Named("mapHotelIdsToHotels")
    default Set<Hotel> mapHotelIdsToHotels(Set<Integer> hotelIds) {
        return hotelIds == null ? null : hotelIds.stream()
                .map(id -> {
                    Hotel hotel = new Hotel();
                    hotel.setId(id);
                    return hotel;
                })
                .collect(Collectors.toSet());
    }

    @Named("mapHotelsToHotelIds")
    default Set<Integer> mapHotelsToHotelIds(Set<Hotel> hotels) {
        return hotels == null ? null : hotels.stream()
                .map(Hotel::getId)
                .collect(Collectors.toSet());
    }

    @Named("mapRoomIdsToRooms")
    default Set<Room> mapRoomIdsToRooms(Set<Integer> roomIds) {
        return roomIds == null ? null : roomIds.stream()
                .map(id -> {
                    Room room = new Room();
                    room.setId(id);
                    return room;
                })
                .collect(Collectors.toSet());
    }

    @Named("mapRoomsToRoomIds")
    default Set<Integer> mapRoomsToRoomIds(Set<Room> rooms) {
        return rooms == null ? null : rooms.stream()
                .map(Room::getId)
                .collect(Collectors.toSet());
    }
}