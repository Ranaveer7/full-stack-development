package com.example.course;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private List<Course> courses = new ArrayList<>();

    @GetMapping
    public List<Course> getAll() {
        return courses;
    }

    @PostMapping
    public Course add(@RequestBody Course c) {
        courses.add(c);
        return c;
    }
}