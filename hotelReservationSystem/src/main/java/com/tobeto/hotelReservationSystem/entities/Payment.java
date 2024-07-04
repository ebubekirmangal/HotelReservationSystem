package com.tobeto.hotelReservationSystem.entities;

import com.tobeto.hotelReservationSystem.entities.enums.PaymentType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Table(name = "payments")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String encryptedCardHolderName;

    private String encryptedExpireYear;

    private String encrytedExpireMonth;

    private String encryptedCardNo;   // Ödeme sağlayıcısı tarafından verilen benzersiz kimlik (paymentId)

    private String encryptedCvv;

    private double totalPrice;

  //TODO: cardholder, expire'ı encryt et

  @Enumerated(EnumType.STRING)
  private PaymentType paymentType;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(mappedBy = "payment")
    private PaymentDetail paymentDetail;


    @Transient
    private String cardNo;

    @Transient
    private String cvv;

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getCvv() {
        return cvv;
    }

}


