package com.tobeto.hotelReservationSystem.services.dtos.requests.image;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UploadImagesRequest {

    private int roomId;

    private List<String> imageData;
}
