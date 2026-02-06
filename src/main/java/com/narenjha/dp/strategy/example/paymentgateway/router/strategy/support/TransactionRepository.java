package com.narenjha.dp.strategy.example.paymentgateway.router.strategy.support;

import java.util.Map;

public interface TransactionRepository {
    Transaction saveTransaction(Transaction transaction);
    Map<BankType, int[]> getSuccessAndFailureCounts();
}