package com.tobeto.hotelReservationSystem.services.concretes;

import com.sun.tools.jconsole.JConsoleContext;
import com.tobeto.hotelReservationSystem.core.services.JwtService;
import com.tobeto.hotelReservationSystem.core.utils.exceptions.types.BusinessException;
import com.tobeto.hotelReservationSystem.entities.User;
import com.tobeto.hotelReservationSystem.repositories.UserRepository;
import com.tobeto.hotelReservationSystem.services.abstracts.AuthService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.auth.LoginAuthRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.auth.RegisterAuthRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.auth.LoginAuthResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.auth.RegisterAuthResponse;
import com.tobeto.hotelReservationSystem.services.mappers.AuthMapper;
import com.tobeto.hotelReservationSystem.services.mappers.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    @Override
    public RegisterAuthResponse register(RegisterAuthRequest request) {

        User user = new User();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setPasswordConfirm(passwordEncoder.encode(request.getPasswordConfirm()));
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setAuthorities(Collections.singletonList(request.getRole()));
        if(!request.getPassword().equals(request.getPasswordConfirm())) {
            throw new BusinessException("Şifreler eşleşmedi.");
        }

        userRepository.save(user);
        var jwtToken = jwtService.generateToken(user);
        RegisterAuthResponse response = new RegisterAuthResponse();
        response.setToken(jwtToken);
        return response;
    }

    @Override
    public LoginAuthResponse login(LoginAuthRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );
        var user = userRepository.findByEmail(request.getEmail()).orElseThrow();
        var jwtToken = jwtService.generateToken(user);
        LoginAuthResponse response = new LoginAuthResponse();
        response.setToken(jwtToken);
        return response;
    }
}