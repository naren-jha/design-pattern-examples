package com.narenjha.dp.strategy.example2.paymentgateway.payment;

import com.narenjha.dp.strategy.example2.paymentgateway.bank.router.RouterStrategyType;
import com.narenjha.dp.strategy.example2.paymentgateway.mode.Mode;

import java.util.List;

public interface PaymentService {
    List<String> showDistribution();
    Transaction makePayment(Mode mode, RouterStrategyType routerStrategy, PaymentIssuingAccount issuingEntity, double amount, Long clientId);
}
