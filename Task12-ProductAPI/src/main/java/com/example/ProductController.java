package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository repo;

    // 🔹 GET all
    @GetMapping
    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    // 🔹 GET by ID
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable int id) {
        return repo.findById(id).orElse(null);
    }

    // 🔹 POST
    @PostMapping
    public Product addProduct(@RequestBody Product p) {
        return repo.save(p);
    }

    // 🔹 PUT
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product p) {
        Product existing = repo.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(p.getName());
            existing.setPrice(p.getPrice());
            return repo.save(existing);
        }
        return null;
    }

    // 🔹 DELETE
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        repo.deleteById(id);
        return "Product Deleted";
    }
}