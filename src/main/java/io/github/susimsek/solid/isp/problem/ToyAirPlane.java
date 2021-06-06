package io.github.susimsek.solid.isp.problem;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ToyAirPlane implements IToy {
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

    @Override
    public void fly() {
        System.out.println("Can fly");
    }

    @Override
    public void move() {
        System.out.println("Can move");
    }
}