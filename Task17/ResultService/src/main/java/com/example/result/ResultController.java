package com.example.result;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/results")
public class ResultController {

    @GetMapping("/{id}")
    public String getResult(@PathVariable int id) {

        RestTemplate restTemplate = new RestTemplate();

        try {
            String url = "http://localhost:8081/students/" + id;

            Object student = restTemplate.getForObject(url, Object.class);

            return "Student Data: " + student.toString() + " | Result: PASS";

        } catch (Exception e) {
            return "Error fetching student data. Service may be down.";
        }
    }
}