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

    private String cardNo;// Ödeme sağlayıcısı tarafından verilen benzersiz kimlik (paymentId)

    private String cvv;

    private double amount;

    private String currency;

    private String description;

    private LocalDateTime date;

    private boolean status; // Ödeme durumu (başarılı, başarısız vb.)

    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(mappedBy = "payment")
    private Reservation reservation;
}
