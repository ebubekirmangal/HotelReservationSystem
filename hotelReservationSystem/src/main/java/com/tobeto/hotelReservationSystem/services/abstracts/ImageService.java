package com.tobeto.hotelReservationSystem.services.abstracts;

import com.tobeto.hotelReservationSystem.services.dtos.responses.image.GetAllImageByRoomId;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ImageService {

    void saveImage(String base64Image, int roomId) throws IOException;

    List<GetAllImageByRoomId> getAllImages(int RoomId);
}