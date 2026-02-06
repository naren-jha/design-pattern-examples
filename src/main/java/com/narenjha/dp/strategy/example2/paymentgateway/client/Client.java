package com.narenjha.dp.strategy.example2.paymentgateway.client;

import com.narenjha.dp.strategy.example2.paymentgateway.mode.Mode;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
@Builder
public class Client {
    private Long id;
    private String name;
    private Set<Mode> modeOfPayments;
    private List<ClientBankAccount> acquiringBankAccounts;
    // other fields as needed
}


