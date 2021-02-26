package com.shopster.backend.controller;

import com.shopster.backend.model.Product;
import com.shopster.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("localhost:3000")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }
    
    @GetMapping("/products/{id}")
    public Product getproduct(@PathVariable Long id) {
        return productService.getById(id);
    }
}
