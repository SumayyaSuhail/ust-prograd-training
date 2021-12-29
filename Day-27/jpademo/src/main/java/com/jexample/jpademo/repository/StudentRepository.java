package com.jexample.jpademo.repository;

import com.jexample.jpademo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
