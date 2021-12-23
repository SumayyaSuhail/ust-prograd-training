package com.abcBank.abcbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AbcBankApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(AbcBankApplication.class, args);
        Customer customer1 = context.getBean(Customer.class);
        customer1.addCustomer("1","Sumayya",123,"a");
        Account account1=context.getBean(Account.class);
        account1.addAccount("1","Sumayya","ABC",5000);

        System.out.println(customer1.getAccountDetails("1"));

        Customer customer2 = context.getBean(Customer.class);
        customer2.addCustomer("2","Suhail",456,"b");
        Account account2=context.getBean(Account.class);
        account1.addAccount("2","Suhail","ABC",10000);

        System.out.println(customer2.getAccountDetails("2"));

        System.out.println(account1.makeTransfer("1","2",2000));
        System.out.println(account1.makeTransfer("2","1",110000));
        account1.getTransferDetails();
    }

}












//    Create a Spring Boot application for ABC Bank. using this application, the customers of the bank
//        should be able to access their account details and transfer funds to the other accounts of the same bank.
//        This application should consist of the following entities:
//        Customer: To store information about the customers of the bank
//        Account:To store information about the existing accounts of the bank
//        FundTransfer: To store information about the funds that are transferred from one account to the other.
//        Create the application and inject dependencies in the entities.