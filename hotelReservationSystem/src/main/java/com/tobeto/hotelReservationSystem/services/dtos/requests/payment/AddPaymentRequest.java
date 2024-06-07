package com.tobeto.hotelReservationSystem.services.dtos.requests.payment;

import com.tobeto.hotelReservationSystem.entities.enums.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddPaymentRequest {
    private String paymentId;
    private double amount;
    private PaymentMethod paymentMethod;
    private String currency;
    private String description;
    private LocalDateTime paymentDate;
    private String status;
    private int userId;
}
