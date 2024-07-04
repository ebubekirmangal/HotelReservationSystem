package com.tobeto.hotelReservationSystem.services.abstracts;

import com.tobeto.hotelReservationSystem.services.dtos.requests.email.AddEmailRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.email.AddEmailResponse;

public interface EmailService {
    void sendEmail(String to, String subject, String body);

    AddEmailResponse sendEmail(AddEmailRequest request);
}
