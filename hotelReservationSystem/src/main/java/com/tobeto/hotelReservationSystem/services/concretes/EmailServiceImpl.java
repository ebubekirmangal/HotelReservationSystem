package com.tobeto.hotelReservationSystem.services.concretes;

import com.tobeto.hotelReservationSystem.entities.Email;

import com.tobeto.hotelReservationSystem.repositories.EmailRepository;
import com.tobeto.hotelReservationSystem.repositories.AuthRepository;

import com.tobeto.hotelReservationSystem.services.abstracts.EmailService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.email.AddEmailRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.email.AddEmailResponse;
import com.tobeto.hotelReservationSystem.services.mappers.EmailMapper;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EmailServiceImpl implements EmailService {


    private final JavaMailSender javaMailSender;


    private final AuthRepository authRepository;


    private final EmailRepository emailRepository;

    public EmailServiceImpl(JavaMailSender javaMailSender, AuthRepository authRepository, EmailRepository emailRepository) {
        this.javaMailSender = javaMailSender;
        this.authRepository = authRepository;
        this.emailRepository = emailRepository;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);

        javaMailSender.send(message);


        // Gönderilen e-postayı kaydetmek için Email entity'sini kullanabilirsiniz
        Email email = new Email();
        email.setToAddress(to);
        email.setSubject(subject);
        email.setBody(body);
        email.setSentDate(LocalDateTime.now());


        emailRepository.save(email);
    }

    @Override
    public AddEmailResponse sendEmail(AddEmailRequest request) {
     Email email = EmailMapper.INSTANCE.emailToAddEmailRequest(request);
     Email Saved = emailRepository.save(email);
     AddEmailResponse response = EmailMapper.INSTANCE.addEmailResponseToEmail(Saved);
     return response;
    }
}


