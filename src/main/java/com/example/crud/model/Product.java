package com.example.crud.model;

import com.example.crud.service.ProductService;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class Product {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    private String name;

    private String description;

    private Double value;

    private Integer amount;

    public Product(String name, String description, Double value, Integer amount) {
        this.name = name;
        this.description = description;
        this.value = value;
        this.amount = amount;
    }
}
