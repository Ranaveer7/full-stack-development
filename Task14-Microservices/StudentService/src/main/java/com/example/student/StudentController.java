package com.example.student;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    private List<Student> students = new ArrayList<>();

    @GetMapping
    public List<Student> getAll() {
        return students;
    }

    @PostMapping
    public Student add(@RequestBody Student s) {
        students.add(s);
        return s;
    }
}