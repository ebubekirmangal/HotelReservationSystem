package com.tobeto.hotelReservationSystem.controllers;

import com.tobeto.hotelReservationSystem.services.abstracts.FeedbackService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.feedback.AddFeedbackRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.feedback.UpdateFeedbackRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.feedback.AddFeedbackResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.feedback.GetAllFeedbackResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.feedback.GetByIdFeedbackResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.feedback.UpdateFeedbackResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/feedback")
public class FeedbacksController {

    private final FeedbackService feedbackService;
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public AddFeedbackResponse add(@RequestBody AddFeedbackRequest request) {
        return feedbackService.add(request);
    }
    @PutMapping("/update")
    public UpdateFeedbackResponse update(@RequestBody UpdateFeedbackRequest request) {
        return feedbackService.update(request);
    }
    @GetMapping("/getAll")
    public List<GetAllFeedbackResponse> getAll() {
        return feedbackService.getAll();
    }
    @GetMapping("/getById/{id}")
    public GetByIdFeedbackResponse getById(@PathVariable("id") int id) {
        return feedbackService.getById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        feedbackService.delete(id);
    }
}
