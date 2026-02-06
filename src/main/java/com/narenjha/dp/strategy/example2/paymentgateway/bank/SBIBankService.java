package com.narenjha.dp.strategy.example2.paymentgateway.bank;

import com.narenjha.dp.strategy.example2.paymentgateway.payment.PaymentIssuingAccount;
import com.narenjha.dp.strategy.example2.paymentgateway.client.ClientBankAccount;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ThreadLocalRandom;

@Data
@Slf4j
public class SBIBankService implements BankService {
    @Override
    public PaymentBankResponse makePayment(PaymentIssuingAccount issuingAccount, ClientBankAccount acquiringAccount, double amount) {
        log.info("Making a payment using SBI. API call will happen here.");
        int randomNumber = ThreadLocalRandom.current().nextInt(0, 5);
        boolean isPaymentSuccessful = randomNumber != 0;

        PaymentBankResponse paymentBankResponse = PaymentBankResponse.builder().build();
        if (isPaymentSuccessful) {
            log.info("Payment successful using SBI from account {} to account {} for amount {}", issuingAccount, acquiringAccount, amount);
            paymentBankResponse.setStatus(true);
        }
        else {
            log.info("Payment failed using SBI from account {} to account {} for amount {}", issuingAccount, acquiringAccount, amount);
            paymentBankResponse.setStatus(false);
        }
        return paymentBankResponse;
    }
}
