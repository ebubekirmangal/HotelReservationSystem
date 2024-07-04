package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Image;
import com.tobeto.hotelReservationSystem.services.dtos.responses.image.GetAllImageByRoomId;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface ImageMapper {

    ImageMapper INSTANCE = Mappers.getMapper(ImageMapper.class);

    GetAllImageByRoomId imageToGetAllImageByRoomId(Image image);

    default List<Integer> map(List<Image> images) {
        if (images == null) {
            return null;
        }
        return images.stream()
                .map(Image::getId)
                .collect(Collectors.toList());
    }
}