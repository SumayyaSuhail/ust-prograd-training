package com.example.demoRelations.service;

import com.example.demoRelations.entity.Student;
import com.example.demoRelations.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    public List<Student> getAllStudents(){
        return repo.findAll();
    }
    public Student saveStudent(Student student){
        return repo.save(student);
    }
    public Student getStudentByStudentId(Long studentId){
        return repo.findById(studentId).get();
    }
}
