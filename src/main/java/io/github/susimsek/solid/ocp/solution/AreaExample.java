package io.github.susimsek.solid.ocp.solution;

/*
With the above code, you could support many shapes: triangle, polygon, and so on without editing old code. Of course, we have to add new classes (Triangle, Pylogon, …).
 */
public class AreaExample {

    public static void main(String[] args) {
        final Rectangle rectangle = new Rectangle(5, 10);
        final Circle circle = new Circle(10);
        final Shape[] shapes = {rectangle, circle};

        final double totalArea = AreaCalculator.calculateArea(shapes);
        System.out.println(String.format("Total area of shapes: %.2f", totalArea));
    }
}