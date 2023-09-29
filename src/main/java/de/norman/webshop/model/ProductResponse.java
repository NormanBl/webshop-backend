package de.norman.webshop.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class ProductResponse {

    private final long id;
    private final String name;
    private final double price;
    private final String description;
    private final List<String> tags;

    public ProductResponse(long id, String name, double price, String description, List<String> tags) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.tags = tags;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getTags() {
        return tags;
    }
}
