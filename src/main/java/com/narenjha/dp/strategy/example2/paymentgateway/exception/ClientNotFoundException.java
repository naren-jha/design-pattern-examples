package com.narenjha.dp.strategy.example2.paymentgateway.exception;

public class ClientNotFoundException extends RuntimeException {
    public ClientNotFoundException(String message) {
        super(message);
    }
}
