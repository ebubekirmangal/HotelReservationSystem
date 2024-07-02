package com.tobeto.hotelReservationSystem.services.concretes;

import com.tobeto.hotelReservationSystem.entities.Image;
import com.tobeto.hotelReservationSystem.repositories.ImageRepository;
import com.tobeto.hotelReservationSystem.services.abstracts.ImageService;
import com.tobeto.hotelReservationSystem.services.dtos.responses.image.GetAllImageByRoomId;
import com.tobeto.hotelReservationSystem.services.mappers.ImageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService {

    private final ImageRepository imageRepository;

    @Override
    public void saveImage(String base64Image, int roomId) throws IOException {
        Image image = new Image();
        image.setData(Base64.getDecoder().decode(base64Image));
        image.getRoom().setId(roomId); // roomId'yi burada set ediyoruz
        imageRepository.save(image);
    }

    @Override
    public List<GetAllImageByRoomId> getAllImages(int RoomId) {
        List<Image> images = imageRepository.findByRoomId(RoomId);
        List<GetAllImageByRoomId> result = new ArrayList<>();
        for(Image image:images){
            GetAllImageByRoomId dto = ImageMapper.INSTANCE.imageToGetAllImageByRoomId(image);
            result.add(dto);
        }
        return result;
    }
}
