package com.example;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    // 🔹 Custom Query Methods
    List<Student> findByDepartment(String department);

    List<Student> findByAgeGreaterThan(int age);

    // 🔹 Pagination
    Page<Student> findAll(Pageable pageable);
}