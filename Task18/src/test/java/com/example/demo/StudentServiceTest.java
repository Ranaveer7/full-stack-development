package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentServiceTest {

    @Test
    void testGetStudent() {
        StudentService service = new StudentService();

        Student s = service.getStudent(1);

        assertEquals(1, s.getId());
        assertEquals("Ravi", s.getName());
    }
}