package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Feature;
import com.tobeto.hotelReservationSystem.entities.Image;
import com.tobeto.hotelReservationSystem.entities.Room;
import com.tobeto.hotelReservationSystem.services.dtos.requests.room.AddRoomRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.room.UpdateRoomRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.room.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Mapper
public interface RoomMapper {

    RoomMapper INSTANCE = Mappers.getMapper(RoomMapper.class);
    @Mapping(target ="images" ,source = "imageIds")
    @Mapping(target ="features" ,source = "featureIds")
    @Mapping(target = "hotel.id", source = "hotelId")
    Room addRoomRequestToRoom(AddRoomRequest request);
    @Mapping(target = "hotel.id", source = "hotelId")
    Room updateRoomRequestToRoom(UpdateRoomRequest request);

    @Mapping(target = "hotelName", source = "hotel.name")
    AddRoomResponse roomToAddRoomResponse(Room room);
    @Mapping(target = "hotelName",source = "hotel.name")
    UpdateRoomResponse roomToUpdateRoomResponse(Room room);
    @Mapping(target = "hotelName", source = "hotel.name")
    GetByIdRoomResponse roomToGetByIdRoomResponse(Room room);
    @Mapping(target ="imageIds" ,source = "images")
    @Mapping(target ="featureIds" ,source = "features")
    @Mapping(target = "hotelName", source = "hotel.name")
    ListRoomResponse roomsToGetAllRoomResponses(Room room); //TODO: düzeltilecek

    GetAllRoomByHotelIdResponse roomsToGetAllRoomByHotelIdResponse(Room room);




    // images listesini imageIds listesine dönüştüren metod
    default List<Integer> map(List<Image> images) {
        if (images == null) {
            return null;
        }
        return images.stream()
                .map(Image::getId)
                .collect(Collectors.toList());
    }


    // features listesini featureIds listesine dönüştüren metod
    default List<Integer> mapFeaturesToFeatureIds(Set<Feature> features) {
        if (features == null) {
            return null;
        }
        return features.stream()
                .map(Feature::getId)
                .collect(Collectors.toList());
    }

    // ID'ye göre Image verisini getiren method (simülasyon)
    private Image getImageDataById(int id) {
        // Bu methodun gerçek bir veritabanı sorgusu veya veri erişim işlemi içermesi gerekiyor
        // Burada sadece örnek bir Image oluşturup dönüyoruz
        Image image = new Image();
        image.setId(id);
        // Veritabanından veya başka bir kaynaktan gerçek veriyi almalısınız
        // Örneğin:
        // image.setData(...); // Base64 veriyi çözme işlemi
        return image;
    }

    // ID'ye göre Feature verisini getiren method (simülasyon)
    private Feature getFeatureById(int id) {
        // Bu methodun gerçek bir veritabanı sorgusu veya veri erişim işlemi içermesi gerekiyor
        // Burada sadece örnek bir Feature oluşturup dönüyoruz
        Feature feature = new Feature();
        feature.setId(id);
        // Veritabanından veya başka bir kaynaktan gerçek veriyi almalısınız
        // Örneğin:
        // feature.setName(...); // Feature ismini almak
        return feature;
    }
}
