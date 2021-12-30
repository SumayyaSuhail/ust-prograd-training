package com.abcBank.abcbank.controller;

//import com.abcBank.abcbank.entity.Account;
import com.abcBank.abcbank.entity.Account;
import com.abcBank.abcbank.entity.Customer;
import com.abcBank.abcbank.service.ABCBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ABCBankController {
    @Autowired
    ABCBankService service;

    //    @RequestMapping("/")
//    welcome to abc bank
    @RequestMapping("register")
    public String register() {
        return "register";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login(HttpServletRequest request) {
        String email = request.getParameter("email");
        String name = request.getParameter("customerName");
        String password = request.getParameter("password");
        String address = request.getParameter("customerAddress");
        String phone = request.getParameter("phoneNumber");
        Customer customer = new Customer(email, name, password, address, phone);
        service.addCustomer(customer);
        Long customerId = service.getCustomerByEmailAndPassword(email, password).getId();
        Account account = new Account(name, 0.00, customerId);
        service.addAccount(account);
        return "login";
    }

    @RequestMapping("/details")
    public String validate(HttpServletRequest request, Model model) {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        Customer customer = service.getCustomerByEmailAndPassword(email, password);
        if (customer.getId().equals(null)) {
            return "login";
        }
        model.addAttribute("customername", customer.getCustomerName());
        model.addAttribute("email", customer.getEmail());
        model.addAttribute("customeraddress", customer.getCustomerAddress());
        model.addAttribute("phonenumber", customer.getPhoneNumber());
        Long customerId = customer.getId();
        Account account=service.getAccountByCustomerId(customerId);
        model.addAttribute("accountbalance", account.getAccountBalance());
        return "details";
    }
}
