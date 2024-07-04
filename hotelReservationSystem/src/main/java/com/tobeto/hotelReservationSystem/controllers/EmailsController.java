package com.tobeto.hotelReservationSystem.controllers;

import com.tobeto.hotelReservationSystem.services.abstracts.EmailService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.email.AddEmailRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.email.AddEmailResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/email")
public class EmailsController {

   private EmailService emailService;

    @PostMapping("/send")
    @ResponseStatus(HttpStatus.CREATED)
    public AddEmailResponse sendEmail(@RequestBody AddEmailRequest request) {
      return emailService.sendEmail(request);
    }
}
