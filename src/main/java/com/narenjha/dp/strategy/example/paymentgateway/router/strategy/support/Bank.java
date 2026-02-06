package com.narenjha.dp.strategy.example.paymentgateway.router.strategy.support;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bank {
    private Long id;
    private String name;
    private BankType type;
}