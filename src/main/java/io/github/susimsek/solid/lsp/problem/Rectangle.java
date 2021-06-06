package io.github.susimsek.solid.lsp.problem;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Rectangle {
     Integer width;
     Integer height;

    public double calculateArea() {
        return (double) width * height;
    }
}
