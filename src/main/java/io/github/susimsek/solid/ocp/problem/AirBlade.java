package io.github.susimsek.solid.ocp.problem;

public class AirBlade extends Motobike {

    public AirBlade(String name, String color) {
        super(name,color);
    }

    @Override
    public void brake() {
        System.out.println("Simple Brake applied!");
    }
}