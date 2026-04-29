package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository repo;

    // CREATE
    @PostMapping
    public Product add(@Valid @RequestBody Product p) {
        return repo.save(p);
    }

    // READ ALL
    @GetMapping
    public List<Product> getAll() {
        return repo.findAll();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Product getById(@PathVariable int id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }

    // UPDATE
    @PutMapping("/{id}")
    public Product update(@PathVariable int id, @Valid @RequestBody Product p) {

        Product existing = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));

        existing.setName(p.getName());
        existing.setPrice(p.getPrice());

        return repo.save(existing);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {

        if (!repo.existsById(id)) {
            throw new ResourceNotFoundException("Product not found");
        }

        repo.deleteById(id);
        return "Deleted Successfully";
    }
}