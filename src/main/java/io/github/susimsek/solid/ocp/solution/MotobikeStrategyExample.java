package io.github.susimsek.solid.ocp.solution;

/*
Airbalde 150 with ABS without editing old code easily.
It could support a lot of different motorbike types. For instance: Wave 100, Sh mode 125, PCX 125/150, and so on.
Even you wanna support ToyMotobike you only add new NoBrake.java and ToyMotobike.java class(inherit IBrakeBehavior interface) without changing code.
 */
public class MotobikeStrategyExample {

    public static void main(String[] args) {
        AirBlade airBlade = new AirBlade("Airblade 125", "White", new BrakeWithoutABS());
        System.out.println(String.format("* %s: ", airBlade.getName()));
        airBlade.brake();
        // New model has ABS
        airBlade.setName("Airblade 150");
        airBlade.setIBrakeBehavior(new BrakeWithABS());
        System.out.println(String.format("* %s: ", airBlade.getName()));
        airBlade.brake();

        Sh sh = new Sh("SH 150" , "Red", new BrakeWithABS());
        System.out.println(String.format("* %s: ", sh.getName()));
        sh.brake();
    }
}