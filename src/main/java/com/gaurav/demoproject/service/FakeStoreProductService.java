package com.gaurav.demoproject.service;

import com.gaurav.demoproject.dto.FakeStoreDto;
import com.gaurav.demoproject.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class FakeStoreProductService implements ProductService {
    ;

    private RestTemplate restTemplate ;

    FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getSingleProduct(Long productId) {
        String url = "https://fakestoreapi.com/products/" + productId;
        System.out.println(url);
        FakeStoreDto fakeStoreProductDto = restTemplate.getForObject(url, FakeStoreDto.class);

        System.out.printf(fakeStoreProductDto.toString());

        return fakeStoreProductDto.toProduct();
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }
}
