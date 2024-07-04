package com.tobeto.hotelReservationSystem.services.dtos.responses.payment;

import com.tobeto.hotelReservationSystem.entities.enums.PaymentType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ListPaymentResponse {

    private int id;

    private int userId;

    private String cardNo;

    private String cvv;

    private double amount;

    private PaymentType paymentType;

    private String currency;

    private String description;

    private LocalDateTime date;

    private boolean status;
}
