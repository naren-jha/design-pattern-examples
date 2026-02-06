package com.narenjha.dp.strategy.example.vehiclerenting.exception;

public class NotFoundBookingStrategy extends RuntimeException {
    public NotFoundBookingStrategy(String message) {
        super(message);
    }
}
