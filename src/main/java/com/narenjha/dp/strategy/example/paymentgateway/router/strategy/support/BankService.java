package com.narenjha.dp.strategy.example.paymentgateway.router.strategy.support;

public interface BankService {
    PaymentBankResponse makePayment(PaymentIssuingAccount issuingAccount, ClientBankAccount acquiringAccount, double amount);
}