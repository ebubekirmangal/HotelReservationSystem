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
import java.util.Set;
import java.util.stream.Collectors;

@Mapper
public interface HotelMapper {

    HotelMapper INSTANCE = Mappers.getMapper(HotelMapper.class);

    //@Mapping(target = "reservations",source = "userId")
    @Mapping(target ="images" ,source = "imageIds")
    @Mapping(target ="features" ,source = "featureIds")
    @Mapping(target ="user.id" ,source = "userId")
    @Mapping(target = "address.id", source = "addressId")
    Hotel  hotelToAddHotelRequest(AddHotelRequest request);
    //@Mapping(target = "reservations",source = "userId")
    @Mapping(target ="images" ,source = "imageIds")
    @Mapping(target ="features" ,source = "featureIds")
    @Mapping(target ="user.id" ,source = "userId")
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


    // Image ID'leri ile gerçek Image verilerini döndüren metot
    default List<Image> mapImageDataToImages(List<Integer> imageIds) {
        if (imageIds == null) {
            return null;
        }
        // Burada imageIds listesindeki her ID için gerçek Image verilerini elde edin
        return imageIds.stream().map(id -> {
            // Burada image verilerini veritabanından veya başka bir kaynaktan alıp doldurun
            Image imageData = getImageDataById(id);
            return imageData;
        }).collect(Collectors.toList());
    }

    default Set<Feature> mapFeaturesToFeatureEntities(List<Integer> featureIds) {
        if (featureIds == null) {
            return null;
        }
        return featureIds.stream()
                .map(this::getFeatureById)
                .collect(Collectors.toSet());
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

    private Feature getFeatureById(int id) {
        // Bu metodun gerçek bir veritabanı sorgusu veya veri erişim işlemi içermesi gerekiyor
        // Burada sadece örnek bir Feature oluşturup dönüyoruz
        Feature feature = new Feature();
        feature.setId(id);
        // Veritabanından veya başka bir kaynaktan gerçek veriyi almalısınız
        // Örneğin:
        // feature.setName(...); // Feature ismini almak
        return feature;
    }

}
