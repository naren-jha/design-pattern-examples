package com.narenjha.dp.strategy.example.paymentgateway.router.strategy.support;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentBankResponse {
    private boolean status;
    private String bankReferenceNumber;
}