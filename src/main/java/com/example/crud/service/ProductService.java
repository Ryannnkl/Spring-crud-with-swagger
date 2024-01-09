package com.example.crud.service;

import com.example.crud.model.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductService {
    Product save(Product product);

    List<Product> findAll();

    Optional<Product> findById(UUID id);

    Product update(Product product);

    void deleteById(UUID id);
}
