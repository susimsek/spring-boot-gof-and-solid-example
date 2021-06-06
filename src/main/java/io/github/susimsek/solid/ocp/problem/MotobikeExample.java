package io.github.susimsek.solid.ocp.problem;

/*
The issue here is ToyMotobike has no brake behavior.
Something is wrong !!!. And we have implemented a meaningless function.
It’s a redundant function. Now, The Airblade releases a new version 150 (brake with ABS).
 */
public class MotobikeExample {

    public static void main(String[] args) {
        AirBlade airBlade = new AirBlade("Airblade 125", "White");
        System.out.println(String.format("* %s: ", airBlade.getName()));
        airBlade.brake();

        Sh sh = new Sh("SH 150", "Red");
        System.out.println(String.format("* %s: ", sh.getName()));
        sh.brake();

        ToyMotobike toyMotobike = new ToyMotobike("Plastic Motobike", "Blue");
        System.out.println(String.format("* %s: ", toyMotobike.getName()));
        toyMotobike.brake();
    }
}