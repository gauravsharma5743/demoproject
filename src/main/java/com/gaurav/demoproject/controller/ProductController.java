package com.gaurav.demoproject.controller;

import com.gaurav.demoproject.model.Product;
import com.gaurav.demoproject.service.ProductService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

   private ProductService productService;
   public ProductController(ProductService productService) {
       this.productService = productService;
   }

    @GetMapping("/getProduct/{id}")
    public Product getProduct( @PathVariable("id") Long id) {
      Product currentproduct =productService.getSingleProduct(id);
        //ResponseEntity<Product> res = new ResponseEntity<>(currentproduct, HttpStatus.OK);
        return currentproduct;
    }

    @GetMapping("/getAllProduct")
    public String getAllProduct() {

       return "kya haal hai";
    }


}
