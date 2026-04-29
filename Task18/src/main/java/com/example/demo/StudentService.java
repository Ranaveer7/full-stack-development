package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public Student getStudent(int id) {
        return new Student(id, "Ravi");
    }
}