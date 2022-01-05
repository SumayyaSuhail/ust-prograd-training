package com.abcBank.abcBank.controller;

import com.abcBank.abcBank.entity.Account;
import com.abcBank.abcBank.entity.Customer;
import com.abcBank.abcBank.service.AccountService;
import com.abcBank.abcBank.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Controller
public class ABCBankController {
    static String email, password;
    static Customer defaultCustomer;
    @Autowired
    private AccountService accountService;

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("register")
    public String register() {
        return "register";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/")
    public String updatePassword(HttpServletRequest request, Model model) {
        if (!(request.getParameter("newpassword").equals(request.getParameter("confirmpassword")))) {
            model.addAttribute("message", "Re-enter the same password!!!");
            return "forgotPassword";
        } else {
            email = request.getParameter("email");
            password = request.getParameter("newpassword");
            Customer customer = customerService.getCustomerByEmail(email);
            customer.setPassword(password);
            customerService.saveCustomer(customer);
            return "index";
        }
    }

    @PostMapping("/login")
    public String login(HttpServletRequest request, Model model) {
        if (!(request.getParameter("password").equals(request.getParameter("confirmpassword")))) {
            model.addAttribute("message", "Re-enter the same password!!!");
            return "register";
        } else {
            email = request.getParameter("email");
            String name = request.getParameter("customerName");
            password = request.getParameter("password");
            String address = request.getParameter("customerAddress");
            String phone = request.getParameter("phoneNumber");
            Customer customer = new Customer(email, name, password, address, phone);
            customerService.saveCustomer(customer);
            //Long customerId = customerService.getCustomerByEmailAndPassword(email, password).getId();
            Account account = new Account(name, 0.00, customer, "ABC Bank", "ABC000510", address);
            accountService.saveAccount(account);
            return "login";
        }
    }

    @RequestMapping("/userDetails")
    public String validate(HttpServletRequest request, Model model) {
        Customer customer = customerService.getCustomerByEmailAndPassword(email, password);
        model.addAttribute("name", customer.getCustomerName());
        model.addAttribute("email", customer.getEmail());
        model.addAttribute("address", customer.getCustomerAddress());
        model.addAttribute("phone", customer.getPhoneNumber());
        return "userDetails";

    }

    @RequestMapping("/accountDetails")
    public String accountDetailsDisplay(Model model) {
        Customer customer = customerService.getCustomerByEmailAndPassword(email, password);
        Account account = accountService.getAccountByCustomerId(customer);
        model.addAttribute("accountId", account.getId());
        model.addAttribute("accountBalance", account.getAccountBalance());
        model.addAttribute("bankName", account.getBankName());
        model.addAttribute("ifscCode", account.getIFSCCode());
        model.addAttribute("bankBranch", account.getBranchName());
        return "accountDetails";
    }

    @RequestMapping("/forgotpassword")
    public String forgotPassword() {
        return "forgotpassword";
    }

    @PostMapping("/home")
    public String welcome(Model model, HttpServletRequest request) {
        Customer customer = customerService.getCustomerByEmailAndPassword(request.getParameter("email"), request.getParameter("password"));
        if (!(Objects.isNull(customer))) {
            email = request.getParameter("email");
            password = request.getParameter("password");
            defaultCustomer = customer;

            return "home";
        } else {
            model.addAttribute("message", "Password doesn't match for the user!!!");
            return "login";
        }
    }

    @RequestMapping("/transfer")
    public String transfer(HttpServletRequest request, Model model) {
        return "transfer";
    }

    @PostMapping("/transfer")
    public String afterTransfer(HttpServletRequest request, Model model) {
        Account myAccount = accountService.getAccountByCustomerId(defaultCustomer);
        Double transferAmount = Double.parseDouble(request.getParameter("amount"));
        if(!(myAccount.getAccountBalance()>=transferAmount)){
            model.addAttribute("message", "Insufficient Balance!!!");
            return "transfer";
        }
        else{
            Account toaccount = accountService.getAccountByAccountId(Long.parseLong(request.getParameter("toAccount")));
            if(!(Objects.isNull(toaccount))){
                Double fromaccount = (myAccount.getAccountBalance()) - transferAmount;
                myAccount.setAccountBalance(fromaccount);
                accountService.saveAccount(myAccount);
                Double tomoney = (toaccount.getAccountBalance()) + transferAmount;
                toaccount.setAccountBalance(tomoney);
                accountService.saveAccount(toaccount);
                model.addAttribute("successMessage", "Transfer Successful!!!");
                return "transfer";
            }
            else{
                model.addAttribute("message", "Account does not exist!!!");
                return "transfer";
            }
        }
    }

    @RequestMapping("/deposit")
    public String deposit() {
        return "deposit";
    }

    @PostMapping("/deposit")
    public String afterDeposit(HttpServletRequest request, Model model) {
        if(!((Double.parseDouble(request.getParameter("deposit")))>0)){
            model.addAttribute("message", "Amount not valid!!!");
            return "deposit";
        }
        else{
            Account myAccount = accountService.getAccountByCustomerId(defaultCustomer);
            Double newBalance = (myAccount.getAccountBalance()) + Double.parseDouble(request.getParameter("deposit"));
            myAccount.setAccountBalance(newBalance);
            accountService.saveAccount(myAccount);
            model.addAttribute("successMessage", "Amount deposited!!!");
            return "deposit";
        }
    }

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

}
