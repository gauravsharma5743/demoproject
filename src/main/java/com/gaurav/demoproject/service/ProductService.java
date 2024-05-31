package com.gaurav.demoproject.service;

import com.gaurav.demoproject.model.Product;

import java.util.List;

public interface ProductService {

    Product getSingleProduct(Long productId);
    List<Product> getAllProducts();
    Product createProduct(Product product);
}
