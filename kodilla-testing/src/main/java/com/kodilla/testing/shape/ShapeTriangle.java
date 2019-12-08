package com.kodilla.testing.shape;

public class ShapeTriangle implements Shape{

    double a = 0;
    double h = 0;

    public ShapeTriangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public double getH() {
        return h;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return (a*h)/2;
    }

    @Override
    public String toString() {
        return "Shape name: " + getShapeName() +
                "\nShape field: " + getField();
    }
}
