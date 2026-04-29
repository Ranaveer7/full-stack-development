package com.example.student;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    private List<Student> list = new ArrayList<>();

    @GetMapping
    public List<Student> getAll() {
        return list;
    }

    @PostMapping
    public Student add(@RequestBody Student s) {
        list.add(s);
        return s;
    }
}