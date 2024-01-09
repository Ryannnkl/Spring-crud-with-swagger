package com.example.crud.service;

import com.example.crud.model.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Component
public class SwaggerService {
    public  List<Product> findProducts() {
        return Arrays.asList(
                new Product("Harry potter e a pedra filosofal", "um menino que descobre que é um bruxo",45.0, 3),
                new Product("Harry potter e a camara secreta", "inimigos do herdeiro cuidado, a camara secreta foi aberta",45.0, 3),
                new Product("Harry potter e o prizioneiro de askaban", "Um rato que tem 1 dedo a menos e vive a mais de 12 anos não levanta suspeita na familia Weasley",45.0, 3)
                );
    }
}
