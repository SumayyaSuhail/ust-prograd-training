package com.abcBank.abcbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@Scope("prototype")
public class Customer {
    private String customerId, customerName, accountId;
    private long phoneNumber;
    public static ArrayList<Customer> customers = new ArrayList<>();

    public void addCustomer(String customerId, String customerName, long phoneNumber, String accountId){
        Customer customer= new Customer();
        customer.customerId=customerId;
        customer.customerName=customerName;
        customer.phoneNumber=phoneNumber;
        customer.accountId=accountId;
        customers.add(customer);
    }

    @Autowired
    public Account account;

    public String getAccountDetails(String accountId) {
        return account.getAccount(accountId);
    }
}
