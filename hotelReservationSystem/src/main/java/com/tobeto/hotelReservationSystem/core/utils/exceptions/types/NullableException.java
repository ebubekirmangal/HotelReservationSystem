package com.tobeto.hotelReservationSystem.core.utils.exceptions.types;

public class NullableException extends RuntimeException{
    public NullableException(String message) {
        super(message);
    }

    public NullableException(String message,Throwable cause) {
        super(message,cause);
    }
}
