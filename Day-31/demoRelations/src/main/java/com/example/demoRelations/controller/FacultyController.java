package com.example.demoRelations.controller;

import com.example.demoRelations.entity.Faculty;
import com.example.demoRelations.entity.Student;
import com.example.demoRelations.service.FacultyService;
import com.example.demoRelations.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class FacultyController {
    @Autowired
    private FacultyService service;

    @GetMapping("/faculties")
    public List<Faculty> list(){
        return service.getAllFaculties();
    }

    @GetMapping("/faculties/new")
    public String create(HttpServletRequest request){
        String name = request.getParameter("name");
        Faculty faculty=new Faculty(name);
        service.saveFaculty(faculty);
        return "Faculty Added";
    }
}
