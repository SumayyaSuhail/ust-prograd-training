package com.abcBank.abcbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Account {
    public static ArrayList<String> accounts=new ArrayList<>(List.of("1","2"));

    @Autowired
    Customer customerAccount;

    public String getAccount(Customer customer) {
        customerAccount=customer;
        for (String account:accounts) {
            if(account==customerAccount.accountId) {
                return customer.getAccountDetails(customerAccount);
            }
        }
        return "Account not found";
    }

    @Autowired
    FundTransfer transfer;

    public String makeTransfer(Customer fromCustomer, Customer toCustomer, double transferAmount) {
        for (String fromAccount:accounts) {
            if (fromAccount==fromCustomer.accountId && fromCustomer.accountBalance>=transferAmount){
                for (String toAccount:accounts){
                    if (toAccount==toCustomer.accountId){
                        toCustomer.accountBalance+=transferAmount;
                        fromCustomer.accountBalance-=transferAmount;
                        transfer.storeTransferDetails(fromAccount,toAccount,transferAmount);
                        return "Transfer Successful from Account"+fromAccount+" to Account"+toAccount+"!";
                    }
                }
            }
        }
        return "Transfer Unsuccesful";
    }
    public void getTransferDetails(){
        transfer.displayList();
    }
}
