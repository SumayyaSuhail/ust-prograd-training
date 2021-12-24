package com.abcBank.abcbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AbcBankApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(AbcBankApplication.class, args);
        Customer customer1 = context.getBean(Customer.class);
        Customer customer2 = context.getBean(Customer.class);
        Account account=context.getBean(Account.class);

        customer1.addCustomerAccount("1","Sumayya",123,5000);
        System.out.println(account.getAccount(customer1));

        customer2.addCustomerAccount("2","Suhail",456,10000);
        System.out.println(account.getAccount(customer2));

        System.out.println(account.makeTransfer(customer1,customer2,2000));
        System.out.println(account.makeTransfer(customer2,customer1,110000));
        account.getTransferDetails();
    }

}












//    Create a Spring Boot application for ABC Bank. using this application, the customers of the bank
//        should be able to access their account details and transfer funds to the other accounts of the same bank.
//        This application should consist of the following entities:
//        Customer: To store information about the customers of the bank
//        Account:To store information about the existing accounts of the bank
//        FundTransfer: To store information about the funds that are transferred from one account to the other.
//        Create the application and inject dependencies in the entities.