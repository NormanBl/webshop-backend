package de.norman.webshop.controller;

import de.norman.webshop.model.*;
import de.norman.webshop.repository.ProductResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductResponseRepository productResponseRepository;

    @GetMapping("/products")
    public Iterable<ProductResponse> getAllProducts() {
        return productResponseRepository.findAll();
    }

    @GetMapping("/products/id")
    public Iterable<ProductResponse> getAllProducts(@RequestParam long id) {
        return productResponseRepository.findAllById(id);
    }

}
