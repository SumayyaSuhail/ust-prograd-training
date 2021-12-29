package com.jexample.jpademo.service;

import com.jexample.jpademo.entity.Student;
import com.jexample.jpademo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//                        Service
//  StudentRepository -------------------- Controller

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    public Student saveStudent(Student student){

        return repo.save(student);
    }
    public List<Student> listAll(){

        return repo.findAll();
    }
}
