package com.enterprise.enterprise_app.service;

import com.enterprise.enterprise_app.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    public List<Product> getProducts() {

        return List.of(
                new Product(1L, "Enterprise Analytics", "1.0.0"),
                new Product(2L, "Customer Dashboard", "2.1.0"),
                new Product(3L, "Reporting Engine", "3.0.2")
        );
    }
}
