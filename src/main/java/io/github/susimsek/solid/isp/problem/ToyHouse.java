package io.github.susimsek.solid.isp.problem;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

/*
we can see some meaningless methods.
They are redundant and the client doesn’t need to implement them.
So, To guarantee code abide by ISP. We will update our program by class diagram:
 */
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

    @Override
    public void fly() {
        System.out.println("Can't fly");
    }

    @Override
    public void move() {
        System.out.println("Can't move");
    }
}
