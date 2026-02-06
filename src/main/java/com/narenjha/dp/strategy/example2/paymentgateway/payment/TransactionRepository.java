package com.narenjha.dp.strategy.example2.paymentgateway.payment;

import com.narenjha.dp.strategy.example2.paymentgateway.bank.BankType;

import java.util.Map;

public interface TransactionRepository {
    Transaction saveTransaction(Transaction transaction);
    Map<BankType, int[]> getSuccessAndFailureCounts();
}
