package com.tobeto.hotelReservationSystem.controllers;

import com.tobeto.hotelReservationSystem.services.abstracts.PaymentService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.payment.AddPaymentRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.payment.UpdatePaymentRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.payment.AddPaymentResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.payment.GetByIdPaymentResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.payment.ListPaymentResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.payment.UpdatePaymentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/payment")
public class PaymentsController {
    private final PaymentService paymentService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public AddPaymentResponse add(@RequestBody AddPaymentRequest request) {
        return paymentService.add(request);
    }
    @PutMapping("/update")
    public UpdatePaymentResponse update(@RequestBody UpdatePaymentRequest request) {
        return paymentService.update(request);
    }
    @GetMapping("/getAll")
    public List<ListPaymentResponse> getAll() {
        return paymentService.getAll();
    }
    @GetMapping("/getById/{id}")
    public GetByIdPaymentResponse getById(@PathVariable("id") int id) {
        return paymentService.getById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable ("id") int id) {
        paymentService.delete(id);
    }
}
