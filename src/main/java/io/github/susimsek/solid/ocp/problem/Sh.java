package io.github.susimsek.solid.ocp.problem;

public class Sh extends Motobike {

    public Sh(String name, String color) {
        super(name,color);
    }

    @Override
    public void brake() {
        System.out.println("Brake with ABS applied!");
    }
}
