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
    date = "2024-07-04T23:10:25+0300",
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
        payment.setCardNo( request.getCardNo() );
        payment.setCvv( request.getCvv() );
        payment.setTotalPrice( request.getTotalPrice() );
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
        payment.setCardNo( request.getCardNo() );
        payment.setCvv( request.getCvv() );
        payment.setId( request.getId() );
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
        addPaymentResponse.setCardNo( payment.getCardNo() );
        addPaymentResponse.setCvv( payment.getCvv() );
        addPaymentResponse.setPaymentType( payment.getPaymentType() );

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
        updatePaymentResponse.setCardNo( payment.getCardNo() );
        updatePaymentResponse.setCvv( payment.getCvv() );
        updatePaymentResponse.setPaymentType( payment.getPaymentType() );

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
        getByIdPaymentResponse.setCardNo( payment.getCardNo() );
        getByIdPaymentResponse.setCvv( payment.getCvv() );
        getByIdPaymentResponse.setPaymentType( payment.getPaymentType() );

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
        listPaymentResponse.setCardNo( payments.getCardNo() );
        listPaymentResponse.setCvv( payments.getCvv() );
        listPaymentResponse.setPaymentType( payments.getPaymentType() );

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
