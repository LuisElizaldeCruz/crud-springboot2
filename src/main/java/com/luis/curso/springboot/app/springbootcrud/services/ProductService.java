package com.luis.curso.springboot.app.springbootcrud.services;

import com.luis.curso.springboot.app.springbootcrud.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();

    Optional<Product> findById(Long id);

    Product save(Product product);

    Optional<Product> update(Long id, Product product);

    public Optional<Product> delete(Long id);
}
