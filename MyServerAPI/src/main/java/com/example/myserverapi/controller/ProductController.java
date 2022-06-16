package com.example.myserverapi.controller;

import com.example.myserverapi.entities.Product;
import com.example.myserverapi.serices.ProductService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.activation.MimeType;

@RestController
@RequestMapping("api/product")
@AllArgsConstructor
public class ProductController {



    private final ProductService productService;

    @RequestMapping(value = "findall", method = RequestMethod.GET, produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<Product>> findAll(){
        try {
            return new ResponseEntity<Iterable<Product>>(productService.findAll(),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Iterable<Product>>(HttpStatus.BAD_REQUEST);
        }
    }

}
