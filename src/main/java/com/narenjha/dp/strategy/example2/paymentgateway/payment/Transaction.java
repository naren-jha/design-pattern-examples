package com.narenjha.dp.strategy.example2.paymentgateway.payment;

import com.narenjha.dp.strategy.example2.paymentgateway.bank.router.RouterStrategyType;
import com.narenjha.dp.strategy.example2.paymentgateway.client.ClientBankAccount;
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
