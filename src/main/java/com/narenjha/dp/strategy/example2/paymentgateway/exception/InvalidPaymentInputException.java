package com.narenjha.dp.strategy.example2.paymentgateway.exception;

public class InvalidPaymentInputException extends RuntimeException {
    public InvalidPaymentInputException(String message) {
        super(message);
    }
}
