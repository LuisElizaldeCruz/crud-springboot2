package com.luis.curso.springboot.app.springbootcrud.repositories;

import org.springframework.data.repository.CrudRepository;

import com.luis.curso.springboot.app.springbootcrud.entities.Product;

public interface productRepository extends CrudRepository <Product, Long>{
}
