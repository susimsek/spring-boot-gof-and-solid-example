package io.github.susimsek.solid.ocp.solution;

import lombok.experimental.UtilityClass;

@UtilityClass
public class AreaCalculator {

    public double calculateArea(Shape[] shapes) {
        double ret = 0d;
        if (shapes == null || shapes.length == 0) {
            return ret;
        }
        for (final Shape shape : shapes) {
            ret += shape.calculateArea();
        }

        return ret;
    }
}