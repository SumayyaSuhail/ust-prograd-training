package com.example.department.department.service;

import com.example.department.department.entity.Department;
import com.example.department.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    public Department findById(Long id) {
        return departmentRepository.findById(id).get();
    }

    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }
}
