package com.narenjha.dp.strategy.example2.paymentgateway.exception;

public class PayModeNotSupportedException extends RuntimeException {
    public PayModeNotSupportedException(String message) {
        super(message);
    }
}
