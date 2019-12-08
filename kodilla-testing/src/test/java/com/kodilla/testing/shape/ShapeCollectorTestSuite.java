package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumUser;
import javafx.scene.shape.Circle;
import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {

        //Given
        ShapeCircle newCircle = new ShapeCircle(10);
        ShapeSquare newSquare = new ShapeSquare(2);
        ShapeTriangle newTriangle = new ShapeTriangle(5,5);
        ShapeCollector newShapeCollector = new ShapeCollector();

        //When
        newShapeCollector.addFigure(newCircle);
        newShapeCollector.addFigure(newSquare);
        newShapeCollector.addFigure(newTriangle);

       //Then
        Assert.assertEquals(3, newShapeCollector.shapeCollector.size());

    }

    @Test
    public void testRemoveFigure() {

        //Given
        ShapeCircle newCircle = new ShapeCircle(10);
        ShapeSquare newSquare = new ShapeSquare(2);
        ShapeTriangle newTriangle = new ShapeTriangle(5,5);
        ShapeCollector newShapeCollector = new ShapeCollector();

        //When
        newShapeCollector.addFigure(newCircle);
        newShapeCollector.addFigure(newSquare);
        newShapeCollector.addFigure(newTriangle);

        newShapeCollector.removeFigure(newCircle);

        //Then
        Assert.assertEquals(2, newShapeCollector.shapeCollector.size());

    }

    @Test
    public void testGetFigure() {

        //Given
        ShapeCircle newCircle = new ShapeCircle(10);
        ShapeCollector newShapeCollector = new ShapeCollector();
        ShapeSquare newSquare = new ShapeSquare(2);
        ShapeTriangle newTriangle = new ShapeTriangle(5,5);

        //When
        newShapeCollector.addFigure(newCircle);
        newShapeCollector.addFigure(newSquare);
        newShapeCollector.addFigure(newTriangle);

        newShapeCollector.getFigure(0);
        newShapeCollector.getFigure(1);
        newShapeCollector.getFigure(2);

        String figureCheck0 = "Shape name: Circle" + "\nShape field: 314.1592653589793";
        String figureCheck1 = "Shape name: Square" + "\nShape field: 4.0";
        String figureCheck2 = "Shape name: Triangle" + "\nShape field: 12.5";

        //Then
        Assert.assertEquals(figureCheck0, newShapeCollector.shapeCollector.get(0).toString());
        Assert.assertEquals(figureCheck1, newShapeCollector.shapeCollector.get(1).toString());
        Assert.assertEquals(figureCheck2, newShapeCollector.shapeCollector.get(2).toString());
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCircle newCircle = new ShapeCircle(10);
        ShapeSquare newSquare = new ShapeSquare(2);
        ShapeTriangle newTriangle = new ShapeTriangle(5,5);
        ShapeCollector newShapeCollector = new ShapeCollector();

        //When
        newShapeCollector.addFigure(newCircle);
        newShapeCollector.addFigure(newSquare);
        newShapeCollector.addFigure(newTriangle);

        String showAllFigures =  "[Shape name: Circle" + "\nShape field: 314.1592653589793, Shape name: Square" +  "\nShape field: 4.0, Shape name: Triangle" + "\nShape field: 12.5]";
        //String showAllFigures =  "Shape name: Circle Shape field: 314.1592653589793, Shape name: Square Shape field: 4.0, Shape name: Triangle Shape field: 12.5";

        //Then
        Assert.assertEquals(showAllFigures, newShapeCollector.shapeCollector.toString());
    }


}
