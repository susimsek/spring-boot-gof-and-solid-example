package io.github.susimsek.solid.ocp.solution;

public class BrakeWithoutABS implements IBrakeBehavior {
    @Override
    public void brake() {
        System.out.println("Simple Brake applied!");
    }
}