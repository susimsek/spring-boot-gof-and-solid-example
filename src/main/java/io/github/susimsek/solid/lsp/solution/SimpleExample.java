package io.github.susimsek.solid.lsp.solution;

/*
*******************************
Rectangle(width: 5, height: 10) => area: 50.00
Square(width: 5, height: 5) => area: 25.00
*******************************
New Rectangle(width: 5, height: 10) => area: 50.00
 */
public class SimpleExample {

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
        final Shap newRectangle = new Rectangle();
        newRectangle.setWidth(5);
        newRectangle.setHeight(10);
        System.out.println(String.format("New Rectangle(width: %d, height: %d) => area: %.2f ",
                                         newRectangle.getWidth(), 
                                         newRectangle.getHeight(), 
                                         newRectangle.calculateArea()));
    }
}