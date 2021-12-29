package com.mvcdemo.mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MVCController {
    @RequestMapping("/")
    public String index(){
        return "home";
    }
    @RequestMapping("/dynamic")
    public String dynamic(Model model){
        int a = 10;
        model.addAttribute("var",a);
        return "dynamic";
    }
    @RequestMapping("/add")
    public String add(){
        return "add";
    }
    @RequestMapping("/result")
    public String result(Model model, HttpServletRequest req){
        int num1=Integer.parseInt(req.getParameter("num1"));
        int num2=Integer.parseInt(req.getParameter("num2"));
        System.out.println(num1+","+num2);
        int sum = num1+num2;
        int diff = num1 - num2;
        int mul=num1*num2;
        int rem = num1/num2;
        model.addAttribute("sum",sum);
        model.addAttribute("diff", diff);
        model.addAttribute("mul",mul);
        model.addAttribute("rem", rem);
        return "result";
    }
    @RequestMapping("/register")
    public String register(){
        return "register";
    }
    @PostMapping("/details")
    public String details(HttpServletRequest request, Model model){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        model.addAttribute("username",username );
        model.addAttribute("password", password);
        model.addAttribute("email", email);
        model.addAttribute("address", address);
        return "details";
    }
}
//data sent in urls
// get ---> read
//data sent in headers
// post ---> create
//put/patch---> update
//delete ---> delete