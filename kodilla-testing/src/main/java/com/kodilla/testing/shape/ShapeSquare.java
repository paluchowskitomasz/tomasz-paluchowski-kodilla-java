package com.kodilla.testing.shape;

public class ShapeSquare implements Shape{

    double a = 0;

    public ShapeSquare(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        return a*a;
    }

    @Override
    public String toString() {
        return "Shape name: " + getShapeName() +
                "\nShape field: " + getField();
    }
}
