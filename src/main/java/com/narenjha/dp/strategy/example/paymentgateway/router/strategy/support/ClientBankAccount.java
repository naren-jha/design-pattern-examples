package com.narenjha.dp.strategy.example.paymentgateway.router.strategy.support;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClientBankAccount {
    private Long id;
    private Bank bank;
    private String accountNumber;
    private String accountName;
    private String accountBranch;
    private String ifscCode;
}