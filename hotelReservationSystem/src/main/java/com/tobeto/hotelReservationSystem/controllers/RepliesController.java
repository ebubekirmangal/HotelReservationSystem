package com.tobeto.hotelReservationSystem.controllers;

import com.tobeto.hotelReservationSystem.services.abstracts.ReplyService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.reply.AddReplyRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.reply.UpdateReplyRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reply.AddReplyResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reply.GetAllReplyResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reply.GetByIdReplyResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reply.UpdateReplyResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/manager/response")
public class RepliesController {

    private final ReplyService replyService;
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public AddReplyResponse add(@RequestBody AddReplyRequest request) {
        return replyService.add(request);
    }
    @PutMapping("/update")
    public UpdateReplyResponse update(@RequestBody UpdateReplyRequest request) {
        return replyService.update(request);
    }
    @GetMapping("/getAll")
    public List<GetAllReplyResponse> getResponses() {
        return replyService.getAll();
    }
    @GetMapping("/getById/{id}")
    public GetByIdReplyResponse getById(@PathVariable("id") int id) {
        return replyService.getById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        replyService.delete(id);
    }
}
