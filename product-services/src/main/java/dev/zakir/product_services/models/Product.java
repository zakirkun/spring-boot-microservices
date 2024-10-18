package dev.zakir.product_services.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    
    @Id
    private String id;
    private String name;
    private double price;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }

    
}
