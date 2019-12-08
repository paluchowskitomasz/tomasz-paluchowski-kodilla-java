package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.shape.ShapeCircle;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.ShapeSquare;
import com.kodilla.testing.shape.ShapeTriangle;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){

        ShapeCircle newCircle = new ShapeCircle(10);
        ShapeSquare newSquare = new ShapeSquare(2);
        ShapeTriangle newTriangle = new ShapeTriangle(5,5);
        ShapeCollector newShapeCollector = new ShapeCollector();

        //When
        newShapeCollector.addFigure(newCircle);
        newShapeCollector.addFigure(newSquare);
        newShapeCollector.addFigure(newTriangle);

        String showFiguresAll =  "Shape name: Circle" + "\nShape field: 314.1592653589793, Shape name: Square" +  "\nShape field: 4.0, Shape name: Triangle" + "\nShape field: 12.5";

        //Then
         newShapeCollector.showFigures();
    }
}