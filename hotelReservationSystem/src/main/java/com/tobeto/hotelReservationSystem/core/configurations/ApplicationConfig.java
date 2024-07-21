package com.tobeto.hotelReservationSystem.core.configurations;

import com.tobeto.hotelReservationSystem.repositories.AuthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {
    private final AuthRepository authRepository;
    @Bean
    public UserDetailsService userDetailsService(){
        return  username -> authRepository.findByEmail(username)
                .orElseThrow(()->new UsernameNotFoundException("User not found"));
    }
}
