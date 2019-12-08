package com.kodilla.testing.shape;

import javafx.scene.shape.Circle;

public class ShapeCircle implements Shape {

    double pi = Math.PI;
    double r = 0;

    public ShapeCircle(double r) {
        this.r = r;
    }

    public double getPi() {
        return pi;
    }

    public double getR() {
        return r;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return pi * (r*r);
    }

    @Override
    public String toString() {
        return "Shape name: " + getShapeName() +
                "\nShape field: " + getField();
    }
}
