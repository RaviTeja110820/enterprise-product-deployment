package com.enterprise.enterprise_app.controller;

import com.enterprise.enterprise_app.model.Product;
import com.enterprise.enterprise_app.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String home() {
        return "Enterprise Product Deployment Platform is Running!";
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP");
    }

    @GetMapping("/version")
    public Map<String, String> version() {
        return Map.of("version", "1.0.0");
    }

    @GetMapping("/api/products")
    public List<Product> products() {
        return productService.getProducts();
    }
}
