package com.tobeto.hotelReservationSystem.controllers;


import com.tobeto.hotelReservationSystem.entities.Feature;
import com.tobeto.hotelReservationSystem.services.abstracts.FeatureService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.feature.AddFeatureRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.feature.UpdateFeatureRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.feature.ListFeatureResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/feature")
public class FeaturesController {

    private final FeatureService featureService;

    @PostMapping("/manager/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Feature> add(@RequestBody AddFeatureRequest request) {
        Feature feature = featureService.add(request);
        return ResponseEntity.ok(feature);
    }

    @PutMapping("/manager/update")
    public ResponseEntity<Feature> update(@RequestBody UpdateFeatureRequest request) { //TODO:pathvariable int id eklenebilir
        Feature feature = featureService.update(request);
        return ResponseEntity.ok(feature);
    }

    @DeleteMapping("/manager/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        featureService.delete(id);
    }
    @GetMapping("/manager/getAllFeatures")
    public List<ListFeatureResponse> getAll(){
        return featureService.getAll();
    }
}