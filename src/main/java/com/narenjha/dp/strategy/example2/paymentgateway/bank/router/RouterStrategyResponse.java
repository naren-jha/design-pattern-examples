package com.narenjha.dp.strategy.example2.paymentgateway.bank.router;

import com.narenjha.dp.strategy.example2.paymentgateway.bank.BankService;
import com.narenjha.dp.strategy.example2.paymentgateway.client.ClientBankAccount;
import lombok.Data;

@Data
public class RouterStrategyResponse {
    private ClientBankAccount selectedAccount;
    private BankService bankService;
}
