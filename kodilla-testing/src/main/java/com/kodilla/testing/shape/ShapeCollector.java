package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> shapeCollector = new ArrayList<Shape>();

    public void addFigure(Shape shape){

        shapeCollector.add(shape);

    }

    public void removeFigure(Shape shape){

        shapeCollector.remove(shape);

    }

    public void getFigure(int n){

        String shapeElement = shapeCollector.get(n).toString();
        System.out.println(shapeElement);

    }

    public void showFigures(){

        System.out.println(shapeCollector);

    }


}
