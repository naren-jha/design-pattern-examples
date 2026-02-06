package com.narenjha.dp.strategy.example.paymentgateway.router.strategy.support;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentIssuingAccount {
    private String upiId;
    private String nbUserName;
    private String nbPassword;
    private String cardNum;
    private String cardCvv;
    private String cardExpiryDate;
}