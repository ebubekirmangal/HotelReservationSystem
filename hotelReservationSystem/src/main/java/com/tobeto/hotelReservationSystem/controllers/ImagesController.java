package com.tobeto.hotelReservationSystem.controllers;

import com.tobeto.hotelReservationSystem.services.abstracts.ImageService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.image.UploadImagesRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.image.GetAllImageByRoomId;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/images")
@RequiredArgsConstructor
public class ImagesController {

    private final ImageService imageService;

    @PostMapping("/upload-images")
    public void uploadImages(@RequestBody UploadImagesRequest request) throws IOException {
        for (String base64Image : request.getImageData()) {
            imageService.saveImage(base64Image, request.getRoomId());
        }
    }

    @GetMapping("/get-images")
    public List<GetAllImageByRoomId> getImages(@RequestParam("RoomId") int RoomId) {
        return  imageService.getAllImages(RoomId);
    }
}