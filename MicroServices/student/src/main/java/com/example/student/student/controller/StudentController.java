package com.example.student.student.controller;

import com.example.student.student.VO.Department;
import com.example.student.student.entity.Student;
import com.example.student.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/student")
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
    public List<Student> listAllStudents(){
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id){
        return studentService.findById(id);
    }

    @PostMapping("/new")
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @GetMapping("/{id}/department")
    public Department getStudentDepartment(@PathVariable Long id){
        return studentService.getStudentDepartment(id);
    }

}
