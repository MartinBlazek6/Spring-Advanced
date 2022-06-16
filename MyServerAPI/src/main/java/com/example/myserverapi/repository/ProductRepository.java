package com.example.myserverapi.repository;

import com.example.myserverapi.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("productRepository")
public interface ProductRepository extends CrudRepository<Product, Long> {
}
