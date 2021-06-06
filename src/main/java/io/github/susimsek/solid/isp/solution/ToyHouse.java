package io.github.susimsek.solid.isp.solution;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ToyHouse implements IToy {
    Double weight;
    String color;

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}