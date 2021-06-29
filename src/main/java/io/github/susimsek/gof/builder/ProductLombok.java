package io.github.susimsek.gof.builder;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level= AccessLevel.PRIVATE)
public class ProductLombok {

    Long id;
    String name;
    LocalDateTime date;
    Boolean inStock;
    String description;
    BigDecimal price;
}
