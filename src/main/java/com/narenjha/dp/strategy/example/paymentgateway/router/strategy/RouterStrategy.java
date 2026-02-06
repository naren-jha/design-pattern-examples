package com.narenjha.dp.strategy.example.paymentgateway.router.strategy;

import com.narenjha.dp.strategy.example.paymentgateway.router.strategy.support.ClientBankAccount;
import com.narenjha.dp.strategy.example.paymentgateway.router.strategy.support.Mode;
import com.narenjha.dp.strategy.example.paymentgateway.router.strategy.support.RouterStrategyResponse;

import java.util.List;

public interface RouterStrategy {

    RouterStrategyResponse selectBank(Mode mode, List<ClientBankAccount> bankAccounts);
    RouterStrategyType strategyType();
}