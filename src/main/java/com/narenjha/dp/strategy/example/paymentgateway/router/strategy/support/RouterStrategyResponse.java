package com.narenjha.dp.strategy.example.paymentgateway.router.strategy.support;

import lombok.Data;

@Data
public class RouterStrategyResponse {
    private ClientBankAccount selectedAccount;
    private BankService bankService;
}