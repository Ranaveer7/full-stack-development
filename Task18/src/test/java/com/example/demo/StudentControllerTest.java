package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class StudentControllerTest {

    @Autowired
    private StudentController controller;

    @Test
    void testController() {
        Student s = controller.getStudent(1);

        assertNotNull(s);
        assertEquals("Ravi", s.getName());
    }
}