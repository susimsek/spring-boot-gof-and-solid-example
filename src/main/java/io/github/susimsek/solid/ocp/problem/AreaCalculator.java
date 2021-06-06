package io.github.susimsek.solid.ocp.problem;

import lombok.experimental.UtilityClass;

@UtilityClass
public class AreaCalculator {

    public double calculateArea(Object[] shapes) {
        double ret = 0d;
        if (shapes == null || shapes.length == 0) {
            return ret;
        }
        for (final Object shape : shapes) {
            if (shape instanceof Rectangle) {
                final Rectangle rectangle = (Rectangle) shape;
                ret += rectangle.getWidth() * rectangle.getHeight();
            } else if (shape instanceof Circle) {
                final Circle circle = (Circle) shape;
                ret += circle.getRadius() * circle.getRadius() * Math.PI;
            }
        }

        return ret;
    }
}