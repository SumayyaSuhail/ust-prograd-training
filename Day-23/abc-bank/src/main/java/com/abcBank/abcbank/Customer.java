package com.abcBank.abcbank;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Customer {
    String accountId, customerName;
    long phoneNumber;
    double accountBalance;

    public void addCustomerAccount(String accountId, String customerName, int phoneNumber, double accountBalance) {
        this.accountId = accountId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.accountBalance = accountBalance;

    }

    public String getAccountDetails(Customer customer) {
        return "AccountId=" + this.accountId + ", CustomerName=" + this.customerName + ", PhoneNumber="
                + this.phoneNumber + ", AccountBalance=" + this.accountBalance;
    }
}
