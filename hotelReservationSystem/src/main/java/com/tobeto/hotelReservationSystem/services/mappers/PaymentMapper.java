package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Payment;
import com.tobeto.hotelReservationSystem.services.dtos.requests.payment.AddPaymentRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.payment.UpdatePaymentRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.payment.AddPaymentResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.payment.GetByIdPaymentResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.payment.ListPaymentResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.payment.UpdatePaymentResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PaymentMapper {

    PaymentMapper INSTANCE = Mappers.getMapper(PaymentMapper.class);
    @Mapping(target = "user.id",source = "userId")
    Payment addPaymentRequestToPayment(AddPaymentRequest request);
    @Mapping(target = "userId",source = "user.id")
    AddPaymentResponse paymentToAddPaymentResponse(Payment payment);
    @Mapping(target = "user.id",source = "userId")
    Payment updatePaymentRequestToPayment(UpdatePaymentRequest request);
    @Mapping(target = "userId",source = "user.id")
    UpdatePaymentResponse paymentToUpdatePaymentResponse(Payment payment);
    @Mapping(target = "userId",source = "user.id")
    GetByIdPaymentResponse paymentToGetByIdPaymentResponse(Payment payment);
    @Mapping(target = "userId",source = "user.id")
    List<ListPaymentResponse> paymentsToListPaymentResponses(List<Payment> payments);
}
