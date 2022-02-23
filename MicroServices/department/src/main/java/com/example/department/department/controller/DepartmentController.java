package com.example.department.department.controller;

import com.example.department.department.entity.Department;
import com.example.department.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/all")
    public List<Department> getAllDepartment(){
        return departmentService.findAll();
    }

    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable Long id){
        return departmentService.findById(id);
    }

    @PostMapping("/new")
    public Department createDepartment(@RequestBody Department department){
        return departmentService.createDepartment(department);
    }
}
