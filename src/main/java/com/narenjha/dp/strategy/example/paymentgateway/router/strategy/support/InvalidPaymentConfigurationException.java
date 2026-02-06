package com.narenjha.dp.strategy.example.paymentgateway.router.strategy.support;

public class InvalidPaymentConfigurationException extends RuntimeException {
    public InvalidPaymentConfigurationException(String message) {
        super(message);
    }
}