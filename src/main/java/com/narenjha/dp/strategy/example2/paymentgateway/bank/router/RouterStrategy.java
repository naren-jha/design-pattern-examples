package com.narenjha.dp.strategy.example2.paymentgateway.bank.router;

import com.narenjha.dp.strategy.example2.paymentgateway.client.ClientBankAccount;
import com.narenjha.dp.strategy.example2.paymentgateway.mode.Mode;

import java.util.List;

public interface RouterStrategy {

    RouterStrategyResponse selectBank(Mode mode, List<ClientBankAccount> bankAccounts);
    RouterStrategyType strategyType();
}
