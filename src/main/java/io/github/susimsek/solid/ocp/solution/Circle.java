package io.github.susimsek.solid.ocp.solution;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level= AccessLevel.PRIVATE)
@AllArgsConstructor
@Getter
@Setter
public class Circle extends Shape {
    Integer radius;

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }
}
