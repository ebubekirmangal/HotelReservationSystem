package com.tobeto.hotelReservationSystem.services.mappers;

import com.tobeto.hotelReservationSystem.entities.Payment;
import com.tobeto.hotelReservationSystem.entities.User;
import com.tobeto.hotelReservationSystem.services.dtos.requests.payment.AddPaymentRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.payment.UpdatePaymentRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.payment.AddPaymentResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.payment.GetByIdPaymentResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.payment.ListPaymentResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.payment.UpdatePaymentResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-24T15:14:34+0300",
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
        payment.setPaymentDate( request.getPaymentDate() );
        payment.setStatus( request.getStatus() );
        payment.setPaymentMethod( request.getPaymentMethod() );

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
        addPaymentResponse.setPaymentMethod( payment.getPaymentMethod() );
        addPaymentResponse.setCurrency( payment.getCurrency() );
        addPaymentResponse.setDescription( payment.getDescription() );
        addPaymentResponse.setPaymentDate( payment.getPaymentDate() );
        addPaymentResponse.setStatus( payment.getStatus() );

        return addPaymentResponse;
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
        payment.setPaymentDate( request.getPaymentDate() );
        payment.setStatus( request.getStatus() );
        payment.setPaymentMethod( request.getPaymentMethod() );

        return payment;
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
        updatePaymentResponse.setPaymentMethod( payment.getPaymentMethod() );
        updatePaymentResponse.setCurrency( payment.getCurrency() );
        updatePaymentResponse.setDescription( payment.getDescription() );
        updatePaymentResponse.setPaymentDate( payment.getPaymentDate() );
        updatePaymentResponse.setStatus( payment.getStatus() );

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
        getByIdPaymentResponse.setPaymentMethod( payment.getPaymentMethod() );
        getByIdPaymentResponse.setCurrency( payment.getCurrency() );
        getByIdPaymentResponse.setDescription( payment.getDescription() );
        getByIdPaymentResponse.setPaymentDate( payment.getPaymentDate() );
        getByIdPaymentResponse.setStatus( payment.getStatus() );

        return getByIdPaymentResponse;
    }

    @Override
    public List<ListPaymentResponse> paymentsToListPaymentResponses(List<Payment> payments) {
        if ( payments == null ) {
            return null;
        }

        List<ListPaymentResponse> list = new ArrayList<ListPaymentResponse>( payments.size() );
        for ( Payment payment : payments ) {
            list.add( paymentToListPaymentResponse( payment ) );
        }

        return list;
    }

    protected User addPaymentRequestToUser(AddPaymentRequest addPaymentRequest) {
        if ( addPaymentRequest == null ) {
            return null;
        }

        User user = new User();

        user.setId( addPaymentRequest.getUserId() );

        return user;
    }

    private int paymentUserId(Payment payment) {
        User user = payment.getUser();
        if ( user == null ) {
            return 0;
        }
        return user.getId();
    }

    protected User updatePaymentRequestToUser(UpdatePaymentRequest updatePaymentRequest) {
        if ( updatePaymentRequest == null ) {
            return null;
        }

        User user = new User();

        user.setId( updatePaymentRequest.getUserId() );

        return user;
    }

    protected ListPaymentResponse paymentToListPaymentResponse(Payment payment) {
        if ( payment == null ) {
            return null;
        }

        ListPaymentResponse listPaymentResponse = new ListPaymentResponse();

        listPaymentResponse.setId( payment.getId() );
        listPaymentResponse.setPaymentId( payment.getPaymentId() );
        listPaymentResponse.setAmount( payment.getAmount() );
        listPaymentResponse.setPaymentMethod( payment.getPaymentMethod() );
        listPaymentResponse.setCurrency( payment.getCurrency() );
        listPaymentResponse.setDescription( payment.getDescription() );
        listPaymentResponse.setPaymentDate( payment.getPaymentDate() );
        listPaymentResponse.setStatus( payment.getStatus() );

        return listPaymentResponse;
    }
}
