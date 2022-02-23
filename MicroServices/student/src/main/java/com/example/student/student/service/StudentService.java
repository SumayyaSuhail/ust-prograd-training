package com.example.student.student.service;

import com.example.student.student.VO.Department;
import com.example.student.student.entity.Student;
import com.example.student.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private RestTemplate restTemplate;

    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    public Student findById(Long id) {
        return studentRepository.findById(id).get();
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Department getStudentDepartment(Long sId) {
        Student student = studentRepository.findById(sId).get();
        Long dId = student.getDepartmentId();
        //return restTemplate.getForObject("http://localhost:8002/department/"+dId,Department.class);
        return (Department) restTemplate.getForObject("http://localhost:8002/department/"+dId, Object.class);
    }
}
