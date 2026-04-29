package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository repo;

    // 🔹 Add student
    @PostMapping("/add")
    public Student add(@RequestBody Student s) {
        return repo.save(s);
    }

    // 🔹 Filter by department
    @GetMapping("/department/{dept}")
    public List<Student> getByDepartment(@PathVariable String dept) {
        return repo.findByDepartment(dept);
    }

    // 🔹 Filter by age
    @GetMapping("/age/{age}")
    public List<Student> getByAge(@PathVariable int age) {
        return repo.findByAgeGreaterThan(age);
    }

    // 🔹 Sorting
    @GetMapping("/sorted")
    public List<Student> getSorted() {
        return repo.findAll(Sort.by("name").ascending());
    }

    // 🔹 Pagination
    @GetMapping("/page")
    public Page<Student> getPage(
            @RequestParam int page,
            @RequestParam int size) {

        Pageable pageable = PageRequest.of(page, size);
        return repo.findAll(pageable);
    }
}