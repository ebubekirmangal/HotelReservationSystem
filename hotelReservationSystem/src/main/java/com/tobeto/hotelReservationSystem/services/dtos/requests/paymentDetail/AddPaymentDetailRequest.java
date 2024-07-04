package com.tobeto.hotelReservationSystem.services.dtos.requests.paymentDetail;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddPaymentDetailRequest {

    private String currency;

    private String description;

    private boolean status;

    private LocalDateTime date;
}
