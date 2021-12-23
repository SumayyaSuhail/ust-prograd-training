package com.abcBank.abcbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Account {
    private String accountNumber, accountName, bankName;
    private double accountBalance;
    static ArrayList<Account> accounts=new ArrayList<>();

    public void addAccount(String accountNumber, String accountName, String bankName, double accountBalance){
        Account account = new Account();
        account.accountNumber=accountNumber;
        account.accountName=accountName;
        account.bankName=bankName;
        account.accountBalance=accountBalance;
        accounts.add(account);
    }
    public String getAccount(String accountId) {
        for (Account acc:accounts) {
            if(accountId==acc.accountNumber) {
                return "AccountId=" + accountId + ", AccountName=" + acc.accountName + ", AccountBalance="
                        + acc.accountBalance + ", BankName=" + acc.bankName;
            }
        }
        return "Account not found";
    }

    @Autowired
    FundTransfer transfer;

    public String makeTransfer(String fromAccount, String toAccount, double amount) {
        for (Account acc:accounts) {
            if (fromAccount==acc.accountNumber&&acc.accountBalance>=amount){
                for (Account acc1:accounts){
                    if (toAccount==acc1.accountNumber&&acc1.bankName==acc.bankName){
                        acc1.accountBalance+=amount;
                        acc.accountBalance-=amount;
                        transfer.storeTransferDetails(fromAccount,toAccount,amount);
                        return "Transfer Successful!";
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
