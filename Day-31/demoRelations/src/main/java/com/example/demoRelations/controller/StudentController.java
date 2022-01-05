package com.example.demoRelations.controller;

import com.example.demoRelations.entity.Faculty;
import com.example.demoRelations.entity.Student;
import com.example.demoRelations.service.FacultyService;
import com.example.demoRelations.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService service;

    @Autowired
    private FacultyService facultyService;

    @GetMapping("/students")
    public List<Student> list(){
        return service.getAllStudents();
    }

    @GetMapping("/students/new")
    public String create(HttpServletRequest request){
        String name = request.getParameter("name");
        Integer age = Integer.parseInt(request.getParameter("age"));
        Student student=new Student(name, age);
        service.saveStudent(student);
        return "Student Added";
    }

    @GetMapping("/students/{studentId}/assign-faculty/{facultyId}")
    public Student assignFaculty(@PathVariable Long studentId, @PathVariable Long facultyId){
        Student student=service.getStudentByStudentId(studentId);
        Faculty faculty=facultyService.getFacultyByFacultyId(facultyId);
        student.setFaculty(faculty);
        return service.saveStudent(student);
    }
}

/*
Relations -> connections
4 types:
1-1                     1-many              many-1              many-many
Student - Admission, Faculty - Students, Faculty - College, Students - Courses
 */
