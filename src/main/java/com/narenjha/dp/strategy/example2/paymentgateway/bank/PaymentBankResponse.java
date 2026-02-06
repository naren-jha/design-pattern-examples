package com.narenjha.dp.strategy.example2.paymentgateway.bank;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentBankResponse {
    private boolean status;
    private String bankReferenceNumber;
}
