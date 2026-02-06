package com.narenjha.dp.strategy.example2.paymentgateway.client;

import com.narenjha.dp.strategy.example2.paymentgateway.bank.Bank;
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
