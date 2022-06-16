package com.example.myserverapi.serices;

import com.example.myserverapi.entities.Product;
import com.example.myserverapi.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service("ProductService")
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product find(long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public void save(Product product) {

        productRepository.save(product);
    }

    @Override
    public void delete(long id) {
        productRepository.delete(find(id));
    }
}
