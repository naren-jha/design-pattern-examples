package com.narenjha.dp.strategy.example2.paymentgateway.bank;

import com.narenjha.dp.strategy.example2.paymentgateway.client.ClientBankAccount;
import com.narenjha.dp.strategy.example2.paymentgateway.payment.PaymentIssuingAccount;

public interface BankService {
    PaymentBankResponse makePayment(PaymentIssuingAccount issuingAccount, ClientBankAccount acquiringAccount, double amount);
}
