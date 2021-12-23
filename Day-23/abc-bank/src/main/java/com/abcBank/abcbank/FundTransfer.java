package com.abcBank.abcbank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class FundTransfer {
    ArrayList<String> transferList = new ArrayList<>();

    public void storeTransferDetails(String fromAccount, String toAccount, double transferAmount) {
        String transferDetails = "From " + fromAccount + "; to " + toAccount + "; AmountTransferred=" + transferAmount;
        transferList.add(transferDetails);
    }
    public void displayList(){
        System.out.println(transferList);
    }
}
