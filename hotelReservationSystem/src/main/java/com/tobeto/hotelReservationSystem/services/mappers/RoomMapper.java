package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Feature;
import com.tobeto.hotelReservationSystem.entities.Image;
import com.tobeto.hotelReservationSystem.entities.Room;
import com.tobeto.hotelReservationSystem.services.dtos.requests.room.AddRoomRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.room.UpdateRoomRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.AddRoomResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.GetByIdRoomResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.ListRoomResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.UpdateRoomResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface RoomMapper {

    RoomMapper INSTANCE = Mappers.getMapper(RoomMapper.class);
    @Mapping(target = "hotel.id", source = "hotelId")
    @Mapping(target = "images", source = "imageData")
    @Mapping(target = "features", source = "features")
    Room addRoomRequestToRoom(AddRoomRequest request);
    @Mapping(target = "hotel.id", source = "hotelId")
    Room updateRoomRequestToRoom(UpdateRoomRequest request);

    @Mapping(target = "hotelName", source = "hotel.name")
    AddRoomResponse roomToAddRoomResponse(Room room);
    @Mapping(target = "hotelName",source = "hotel.name")
    UpdateRoomResponse roomToUpdateRoomResponse(Room room);
    @Mapping(target = "hotelName", source = "hotel.name")
    GetByIdRoomResponse roomToGetByIdRoomResponse(Room room);
    @Mapping(target = "hotelName", source = "hotel.name")
    List<ListRoomResponse> roomsToGetAllRoomResponses(List<Room> rooms);


    default List<Image> mapImageDataToImages(List<String> imageData) {
        if (imageData == null) {
            return null;
        }
        return imageData.stream().map(data -> {
            Image image = new Image();
            image.setData(Base64.getDecoder().decode(data));
            return image;
        }).collect(Collectors.toList());
    }
    default List<Feature> mapFeaturesToFeatureEntities(List<String> features) {
        if (features == null) {
            return null;
        }
        return features.stream().map(name -> {
            Feature feature = new Feature();
            feature.setName(name);
            return feature;
        }).collect(Collectors.toList());
    }
}
