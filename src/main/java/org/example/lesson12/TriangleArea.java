package org.example.lesson12;

import static java.lang.String.format;
import static org.apache.commons.lang3.Validate.isTrue;

public class TriangleArea {
    private double side1;
    private double side2;
    private double side3;

    public TriangleArea(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double calculateArea(double side1, double side2, double side3) {
        isTrue(isValid(side1, side2, side3), format(
                "Triangle with sides 1) %f 2) %f 3) %f is incorrect", side1, side2, side3));

        double area;
        double s = (side1 + side2 + side3) / 2;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }

    private boolean isValid(double side1, double side2, double side3) {
        if (side1 + side2 > side3 &&
                side2 + side3 > side1 &&
                side1 + side3 > side2) return true;
        else return false;
    }
}
