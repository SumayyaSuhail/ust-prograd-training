package com.example.demoTest.controller;

import com.example.demoTest.entity.Student;
import com.example.demoTest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("/students")
    public List<Student> list(){
        return service.getAllStudents();
    }

    @GetMapping("/students/new")
    public Student create(HttpServletRequest request){
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        Integer age=Integer.parseInt(request.getParameter("age"));
        Student student=new Student(name, email, age);
        return service.createStudent(student);
    }

    @GetMapping("/students/check/email/{email}")
    public Boolean checkEmail(@PathVariable String email){
        return service.checkIfEmailExists(email);
    }
}
