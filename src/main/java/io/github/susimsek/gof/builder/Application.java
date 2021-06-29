package io.github.susimsek.gof.builder;

import io.github.susimsek.gof.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setId(12L);
        product1.setDescription("Description");
        product1.setDescription("Name");


        Product product2 = new Product.ProductBuilder().
                id(12L)
                .name("Name")
                .description("Description")
                .build();

        System.out.println(product1);

        System.out.println(product2);

        ProductLombok productLombok = ProductLombok.builder()
                .id(12L)
                .name("Name")
                .description("Description")
                .build();

        System.out.println(productLombok);
    }
}