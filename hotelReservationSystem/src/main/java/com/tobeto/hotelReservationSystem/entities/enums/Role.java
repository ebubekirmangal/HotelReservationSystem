package com.tobeto.hotelReservationSystem.entities.enums;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    GUEST,
    MANAGER;

    @Override
    public String getAuthority() {
        return name();
    }
}
