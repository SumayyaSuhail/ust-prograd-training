package com.abcBank.abcbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CustomerController {
    ArrayList<String> customerDetails = new ArrayList<>(List.of("1","Sumayya", "123", "5000", "2", "Suhail", "456","10000"));
    public String userId;
    @RequestMapping("/")
    public String login(){
        return "customerLogin";
    }
    @Autowired
    Account account;
    @RequestMapping("/validation")
    public  String validation(Model model, HttpServletRequest req){
        userId=req.getParameter("accountId");
        int userPassword= Integer.parseInt(req.getParameter("password"));
        int i=0,accountIndex=0;
        for(i=0; i<customerDetails.size();i++){
            if(customerDetails.get(i).equals(userId)){
                accountIndex=i;
            }
        }
        String message = account.validateCustomer(userId,userPassword);
        model.addAttribute("validMessage", message);
        if(message.equals("Login Successful!")){
            model.addAttribute("accountId", customerDetails.get(accountIndex));
            model.addAttribute("accountName", customerDetails.get(accountIndex+1));
            model.addAttribute("phoneNumber", customerDetails.get(accountIndex+2));
            model.addAttribute("accountBalance",customerDetails.get(accountIndex+3));
        }
        return "validation";
    }
//    @Autowired
//    Customer customer1;
//    Customer customer2;
//    @RequestMapping("/accountDetails")
//    public String displayAccountDetails(Model model, HttpServletRequest req){
//        String userName=userId;
//        if(userName.equals("1")){
//            String details = account.getAccount(customer1);
//            model.addAttribute("details", details);
//        }
//        else if(userName.equals("2")){
//            String details = account.getAccount(customer2);
//            model.addAttribute("details", details);
//        }
//        return "accountDetails";
//    }
}
