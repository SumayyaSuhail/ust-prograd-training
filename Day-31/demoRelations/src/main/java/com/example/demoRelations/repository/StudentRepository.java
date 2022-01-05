package com.example.demoRelations.repository;

import com.example.demoRelations.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
