package com.example.demoTest.repository;

import com.example.demoTest.entity.Student;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository repo;

    @Nested
    class checkIfEmailExistsOrNot{
        @BeforeEach
        public void setUp(){
            Student student=new Student("Sumayya", "sumayya@gmail.com",22);
            repo.save(student);
        }

        @AfterEach
        public void tearDown(){
            repo.deleteAll();
        }
        @Test
        public void ReturnsTrueIfEmailExists(){
            Boolean actual=repo.checkByEmail("sumayya@gmail.com");
            Assertions.assertTrue(actual);
        }
        @Test
        public void ReturnsFalseIfEmailDoesNotExists(){
            Boolean actual=repo.checkByEmail("khavin@gmail.com");
            Assertions.assertFalse(actual);
        }
    }
}