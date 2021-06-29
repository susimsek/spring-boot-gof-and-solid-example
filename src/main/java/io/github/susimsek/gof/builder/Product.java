package io.github.susimsek.gof.builder;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Product {

    Long id;
    String name;
    LocalDateTime date;
    Boolean inStock;
    String description;
    BigDecimal price;

    public Product(ProductBuilder productBuilder) {
        this.id = productBuilder.id;
        this.name = productBuilder.name;
        this.date = productBuilder.date;
        this.inStock = productBuilder.inStock;
        this.description = productBuilder.description;
        this.price = productBuilder.price;
    }

    @FieldDefaults(level= AccessLevel.PRIVATE)
    public static class ProductBuilder {

        Long id;
        String name;
        LocalDateTime date;
        Boolean inStock;
        String description;
        BigDecimal price;

        public ProductBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public ProductBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder date(LocalDateTime date) {
            this.date = date;
            return this;
        }

        public ProductBuilder inStock(Boolean inStock) {
            this.inStock = inStock;
            return this;
        }

        public ProductBuilder description(String description) {
            this.description = description;
            return this;
        }

        public ProductBuilder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Product build(){
            Product product = new Product(this);
            return product;
        }

    }
}
