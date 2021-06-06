package io.github.susimsek.solid.lsp.solution;


import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Shap {
    Integer width;
    Integer height;

    public double calculateArea() {
        return (double) width * height;
    }
}