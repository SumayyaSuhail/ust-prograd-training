package com.example.demoRelations.service;

import com.example.demoRelations.entity.Faculty;
import com.example.demoRelations.entity.Student;
import com.example.demoRelations.repository.FacultyRepository;
import com.example.demoRelations.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyService {
    @Autowired
    private FacultyRepository repo;

    public List<Faculty> getAllFaculties(){
        return repo.findAll();
    }
    public Faculty saveFaculty(Faculty faculty){
        return repo.save(faculty);
    }
    public Faculty getFacultyByFacultyId(Long facultyId){
        return repo.findById(facultyId).get();
    }
}
