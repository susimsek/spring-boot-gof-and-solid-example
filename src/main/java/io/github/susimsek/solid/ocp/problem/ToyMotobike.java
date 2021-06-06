package io.github.susimsek.solid.ocp.problem;

public class ToyMotobike extends Motobike {

    public ToyMotobike(String name, String color) {
        super(name,color);
    }

    @Override
    public void brake() {
        System.out.println("No brake!");
    }
}