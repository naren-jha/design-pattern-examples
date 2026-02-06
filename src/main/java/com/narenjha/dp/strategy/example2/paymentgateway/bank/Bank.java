package com.narenjha.dp.strategy.example2.paymentgateway.bank;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bank {
    private Long id;
    private String name;
    private BankType type;
}
