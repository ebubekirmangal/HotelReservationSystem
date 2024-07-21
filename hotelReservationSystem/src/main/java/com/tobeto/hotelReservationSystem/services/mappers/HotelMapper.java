package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.*;
import com.tobeto.hotelReservationSystem.services.dtos.requests.hotel.AddHotelRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.hotel.UpdateHotelRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.AddHotelResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.GetByIdHotelResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.ListHotelResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.hotel.UpdateHotelResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface HotelMapper {

    HotelMapper INSTANCE = Mappers.getMapper(HotelMapper.class);

    //@Mapping(target = "reservations",source = "userId")
    @Mapping(target = "images", source = "imageData")
    @Mapping(target = "features", source = "features")
    @Mapping(target = "user.id",source = "userId")
    Hotel  hotelToAddHotelRequest(AddHotelRequest request);
    //@Mapping(target = "reservations",source = "userId")
    @Mapping(target = "address.id", source = "addressId")
    Hotel hotelToUpdateHotelRequest(UpdateHotelRequest request);
    //@Mapping(target="userId",source = "reservations")
    @Mapping(target = "addressId", source = "address.id")
    AddHotelResponse addHotelResponseToHotel(Hotel hotel);
   // @Mapping(target="userId",source = "reservations")
   @Mapping(target = "addressId", source = "address.id")
    UpdateHotelResponse updateHotelResponseToHotel(Hotel hotel);
   // @Mapping(target="userId",source = "reservations")
   @Mapping(target = "addressId", source = "address.id")
    ListHotelResponse ListHotelResponseToHotel(Hotel hotel);
   // @Mapping(target="userId",source = "reservations")
   @Mapping(target = "addressId", source = "address.id")
    GetByIdHotelResponse getByIdHotelResponseToHotel(Hotel hotel);
/*
    default List<User> mapReservationsToHotels(List<Reservation> reservations) {
        return reservations.stream()
                .map(Reservation::getHotel::getUser()::getId())
                .collect(Collectors.toList());
    }

 */
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
