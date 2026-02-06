package com.narenjha.dp.strategy.example.paymentgateway.router.strategy.support;

import com.narenjha.dp.strategy.example.paymentgateway.router.strategy.RouterStrategyType;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Transaction {
    private Long id;
    private PaymentIssuingAccount issuingAccount;
    private ClientBankAccount acquiringAccount;
    private Double amount;
    private Boolean status;
    private String gatewayReferenceNumber;
    private LocalDate createdAt;
    private RouterStrategyType routerType;
}