package com.gaurav.demoproject.dto;

import com.gaurav.demoproject.model.Category;
import com.gaurav.demoproject.model.Product;
import org.apache.catalina.filters.RateLimitFilter;
import org.springframework.jdbc.core.metadata.OracleTableMetaDataProvider;

public class FakeStoreDto {
    private Long id;
    private String title;
    private double price;
    private String category;
    private String description;
    private String image;
    private Rating rating;

    public Product toProduct() {
       Product product = new Product();
       product.setId(id);
       product.setTitle(title);
       product.setPrice(price);
       product.setDescription(description);
       product.setImageUrl(image);

       return product;
    }

    @Override
    public String toString() {
        return "FakeStoreDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", rating=" + rating +
                '}';
    }
}
