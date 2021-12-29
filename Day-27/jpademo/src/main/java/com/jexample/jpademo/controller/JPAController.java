package com.jexample.jpademo.controller;

import com.jexample.jpademo.entity.Student;
import com.jexample.jpademo.repository.StudentRepository;
import com.jexample.jpademo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
public class JPAController {
    @Autowired
    private StudentService service;

    @RequestMapping("/")
    public String index(){
        Student student= new Student("abb", "2b", 90.00, 22, "456214");
        service.saveStudent(student);
        return "Student added";
    }



    //https://localhost:4000/create?name=xyz&phone=99999
    @RequestMapping("/create")
    public Student create(HttpServletRequest request){
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        Student student=new Student(name, "2a",100.00,20,phone);
        return service.saveStudent(student);
    }
    @RequestMapping("/list")
    public List<Student> list(){

        return service.listAll();
    }
}
