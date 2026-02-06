package com.narenjha.dp.strategy.example2.paymentgateway.client;

import com.narenjha.dp.strategy.example2.paymentgateway.mode.Mode;

import java.util.List;
import java.util.Set;

public interface ClientRepository {
    Client addClient(String name, Set<Mode> modes, List<ClientBankAccount> acquiringAccounts);
    boolean removeClient(Long id);
    boolean hasClient(Long id);
    Client getById(Long id);
}
