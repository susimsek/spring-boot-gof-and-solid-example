package io.github.susimsek.solid.ocp.solution;

public class BrakeWithABS implements IBrakeBehavior {
    @Override
    public void brake() {
        System.out.println("Brake with ABS applied!");
    }
}