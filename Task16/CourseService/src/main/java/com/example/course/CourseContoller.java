package com.example.course;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private List<Course> list = new ArrayList<>();

    @GetMapping
    public List<Course> getAll() {
        return list;
    }

    @PostMapping
    public Course add(@RequestBody Course c) {
        list.add(c);
        return c;
    }
}