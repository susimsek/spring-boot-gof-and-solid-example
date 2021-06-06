package io.github.susimsek.solid.ocp.problem;

/*
Objects or entities should be open for extension but closed for modification.
we have to support Triangle Shape. We have to edit the AreaCalculator.java class that violates OCP. Therefore, We need to update our program to respond to the new requirement. Consider the below class diagram:
 */
public class AreaExample {

    public static void main(String[] args) {
        final Rectangle rectangle = new Rectangle(5, 10);
        final Circle circle = new Circle(10);
        final Object[] shapes = {rectangle, circle};

        final double totalArea = AreaCalculator.calculateArea(shapes);
        System.out.println(String.format("Total area of shapes: %.2f", totalArea));
    }
}