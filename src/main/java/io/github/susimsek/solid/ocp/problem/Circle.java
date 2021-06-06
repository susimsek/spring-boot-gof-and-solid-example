package io.github.susimsek.solid.ocp.problem;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level= AccessLevel.PRIVATE)
@AllArgsConstructor
@Getter
@Setter
public class Circle {
    Integer radius;
}