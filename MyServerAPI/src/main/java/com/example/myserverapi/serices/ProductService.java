package com.example.myserverapi.serices;

import com.example.myserverapi.entities.Product;

public interface ProductService {

    public Iterable<Product> findAll();

    public Product find(long id);

    public void save(Product product);


    public void delete(long id);

}
