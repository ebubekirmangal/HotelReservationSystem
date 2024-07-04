package com.tobeto.hotelReservationSystem.services.dtos.requests.payment;

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
public class AddPaymentRequest {

    private int userId;

    private String cardNo;

    private String expireYear;

    private String expireMonth;

    private String cardHolderName;

    private String cvv;

    private double totalPrice;

    private PaymentType paymentType;




}
