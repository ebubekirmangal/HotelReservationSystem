package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Payment;
import com.tobeto.hotelReservationSystem.entities.User;
import com.tobeto.hotelReservationSystem.services.dtos.requests.payment.AddPaymentRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.payment.UpdatePaymentRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.payment.AddPaymentResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.payment.GetByIdPaymentResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.payment.ListPaymentResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.payment.UpdatePaymentResponse;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-26T15:50:14+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.3 (Oracle Corporation)"
)
public class PaymentMapperImpl implements PaymentMapper {

    @Override
    public Payment addPaymentRequestToPayment(AddPaymentRequest request) {
        if ( request == null ) {
            return null;
        }

        Payment payment = new Payment();

        payment.setUser( addPaymentRequestToUser( request ) );
        payment.setPaymentId( request.getPaymentId() );
        payment.setAmount( request.getAmount() );
        payment.setCurrency( request.getCurrency() );
        payment.setDescription( request.getDescription() );
        payment.setDate( request.getDate() );
        payment.setStatus( request.isStatus() );
        payment.setPaymentType( request.getPaymentType() );

        return payment;
    }

    @Override
    public Payment updatePaymentRequestToPayment(UpdatePaymentRequest request) {
        if ( request == null ) {
            return null;
        }

        Payment payment = new Payment();

        payment.setUser( updatePaymentRequestToUser( request ) );
        payment.setId( request.getId() );
        payment.setPaymentId( request.getPaymentId() );
        payment.setAmount( request.getAmount() );
        payment.setCurrency( request.getCurrency() );
        payment.setDescription( request.getDescription() );
        payment.setDate( request.getDate() );
        payment.setStatus( request.isStatus() );
        payment.setPaymentType( request.getPaymentType() );

        return payment;
    }

    @Override
    public AddPaymentResponse paymentToAddPaymentResponse(Payment payment) {
        if ( payment == null ) {
            return null;
        }

        AddPaymentResponse addPaymentResponse = new AddPaymentResponse();

        addPaymentResponse.setUserId( paymentUserId( payment ) );
        addPaymentResponse.setId( payment.getId() );
        addPaymentResponse.setPaymentId( payment.getPaymentId() );
        addPaymentResponse.setAmount( payment.getAmount() );
        addPaymentResponse.setPaymentType( payment.getPaymentType() );
        addPaymentResponse.setCurrency( payment.getCurrency() );
        addPaymentResponse.setDescription( payment.getDescription() );
        addPaymentResponse.setDate( payment.getDate() );
        addPaymentResponse.setStatus( payment.isStatus() );

        return addPaymentResponse;
    }

    @Override
    public UpdatePaymentResponse paymentToUpdatePaymentResponse(Payment payment) {
        if ( payment == null ) {
            return null;
        }

        UpdatePaymentResponse updatePaymentResponse = new UpdatePaymentResponse();

        updatePaymentResponse.setUserId( paymentUserId( payment ) );
        updatePaymentResponse.setId( payment.getId() );
        updatePaymentResponse.setPaymentId( payment.getPaymentId() );
        updatePaymentResponse.setAmount( payment.getAmount() );
        updatePaymentResponse.setPaymentType( payment.getPaymentType() );
        updatePaymentResponse.setCurrency( payment.getCurrency() );
        updatePaymentResponse.setDescription( payment.getDescription() );
        updatePaymentResponse.setDate( payment.getDate() );
        updatePaymentResponse.setStatus( payment.isStatus() );

        return updatePaymentResponse;
    }

    @Override
    public GetByIdPaymentResponse paymentToGetByIdPaymentResponse(Payment payment) {
        if ( payment == null ) {
            return null;
        }

        GetByIdPaymentResponse getByIdPaymentResponse = new GetByIdPaymentResponse();

        getByIdPaymentResponse.setUserId( paymentUserId( payment ) );
        getByIdPaymentResponse.setId( payment.getId() );
        getByIdPaymentResponse.setPaymentId( payment.getPaymentId() );
        getByIdPaymentResponse.setAmount( payment.getAmount() );
        getByIdPaymentResponse.setPaymentType( payment.getPaymentType() );
        getByIdPaymentResponse.setCurrency( payment.getCurrency() );
        getByIdPaymentResponse.setDescription( payment.getDescription() );
        getByIdPaymentResponse.setDate( payment.getDate() );
        getByIdPaymentResponse.setStatus( payment.isStatus() );

        return getByIdPaymentResponse;
    }

    @Override
    public ListPaymentResponse paymentsToListPaymentResponses(Payment payments) {
        if ( payments == null ) {
            return null;
        }

        ListPaymentResponse listPaymentResponse = new ListPaymentResponse();

        listPaymentResponse.setUserId( paymentUserId( payments ) );
        listPaymentResponse.setId( payments.getId() );
        listPaymentResponse.setPaymentId( payments.getPaymentId() );
        listPaymentResponse.setAmount( payments.getAmount() );
        listPaymentResponse.setPaymentType( payments.getPaymentType() );
        listPaymentResponse.setCurrency( payments.getCurrency() );
        listPaymentResponse.setDescription( payments.getDescription() );
        listPaymentResponse.setDate( payments.getDate() );
        listPaymentResponse.setStatus( payments.isStatus() );

        return listPaymentResponse;
    }

    protected User addPaymentRequestToUser(AddPaymentRequest addPaymentRequest) {
        if ( addPaymentRequest == null ) {
            return null;
        }

        User user = new User();

        user.setId( addPaymentRequest.getUserId() );

        return user;
    }

    protected User updatePaymentRequestToUser(UpdatePaymentRequest updatePaymentRequest) {
        if ( updatePaymentRequest == null ) {
            return null;
        }

        User user = new User();

        user.setId( updatePaymentRequest.getUserId() );

        return user;
    }

    private int paymentUserId(Payment payment) {
        User user = payment.getUser();
        if ( user == null ) {
            return 0;
        }
        return user.getId();
    }
}
