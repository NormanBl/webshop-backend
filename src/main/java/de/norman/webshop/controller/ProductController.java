package de.norman.webshop.controller;

import de.norman.webshop.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<ProductResponse> getAllProducts() {
        return List.of(
                new ProductResponse(
                        1,
                        "Kopfhörer",
                        140,
                        "In Ear Kopfhörer",
                        Arrays.asList("Kopfhörer", "InEar")
                )
        );
    }

}
