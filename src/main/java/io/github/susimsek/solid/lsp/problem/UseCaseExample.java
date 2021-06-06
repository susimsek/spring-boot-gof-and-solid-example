package io.github.susimsek.solid.lsp.problem;

/*
Objects in a program should be replaceable with instances of their subtypes without altering the correctness of that program.
the new rectangle object has width = 5 and height = 10 but the area = 100.
It’s the wrong logic and the parent class’s object couldn’t instead of the child class’s object without altering the correctness.
 */
public class UseCaseExample {

    public static void main(String[] args) {
        System.out.println("*******************************");
        final Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        System.out.println(String.format("Rectangle(width: %d, height: %d) => area: %.2f ",
                                         rectangle.getWidth(), 
                                         rectangle.getHeight(), 
                                         rectangle.calculateArea()));

        final Square square = new Square();
        square.setWidth(5);
        System.out.println(String.format("Square(width: %d, height: %d) => area: %.2f ",
                                         square.getWidth(), 
                                         square.getHeight(), 
                                         square.calculateArea()));

        System.out.println("*******************************");
        final Rectangle newRectangle = new Square();
        newRectangle.setWidth(5);
        newRectangle.setHeight(10);
        System.out.println(String.format("New Rectangle(width: %d, height: %d) => area: %.2f ",
                                         newRectangle.getWidth(), 
                                         newRectangle.getHeight(), 
                                         newRectangle.calculateArea()));
    }
}