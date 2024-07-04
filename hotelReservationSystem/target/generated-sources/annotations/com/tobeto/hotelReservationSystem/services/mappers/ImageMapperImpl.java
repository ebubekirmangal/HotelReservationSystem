package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Image;
import com.tobeto.hotelReservationSystem.services.dtos.responses.image.GetAllImageByRoomId;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-04T23:10:25+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.3 (Oracle Corporation)"
)
public class ImageMapperImpl implements ImageMapper {

    @Override
    public GetAllImageByRoomId imageToGetAllImageByRoomId(Image image) {
        if ( image == null ) {
            return null;
        }

        GetAllImageByRoomId getAllImageByRoomId = new GetAllImageByRoomId();

        return getAllImageByRoomId;
    }
}
