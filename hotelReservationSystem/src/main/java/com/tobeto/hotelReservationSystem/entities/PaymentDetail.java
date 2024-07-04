package com.tobeto.hotelReservationSystem.entities;

import com.tobeto.hotelReservationSystem.entities.enums.PaymentType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Table(name = "payment_details")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String currency;

    private String description;

    private LocalDateTime date;

    private boolean status; // Ödeme durumu (başarılı, başarısız vb.)

    @OneToOne(mappedBy = "paymentDetail")
    private Reservation reservation;

    @OneToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;



}
