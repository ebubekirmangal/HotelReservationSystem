package com.tobeto.hotelReservationSystem.services.abstracts;

import com.tobeto.hotelReservationSystem.services.dtos.requests.payment.AddPaymentRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.payment.UpdatePaymentRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.payment.AddPaymentResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.payment.GetByIdPaymentResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.payment.ListPaymentResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.payment.UpdatePaymentResponse;

import java.util.List;

public interface PaymentService {
    AddPaymentResponse add(AddPaymentRequest request);

    UpdatePaymentResponse update(UpdatePaymentRequest request);

    void delete(int id);

    List<ListPaymentResponse> getAll();

    GetByIdPaymentResponse getById(int id);
}
