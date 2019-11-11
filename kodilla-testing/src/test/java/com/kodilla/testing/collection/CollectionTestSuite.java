package com.kodilla.testing.collection;
import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: Start");
    }
    @After
    public void after(){
        System.out.println("Test Case: End");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        ArrayList<Integer> emptyArrayList = new ArrayList<Integer>();
        boolean isEmptyArrayList = emptyArrayList.isEmpty();

        //When
        ArrayList<Integer> resultsFromOddNumbersExterminator = oddNumbersExterminator.exterminate(emptyArrayList);
        boolean isEmptyResultsFromOddNumbersExterminator = resultsFromOddNumbersExterminator.isEmpty();

        //Then
        Assert.assertEquals(isEmptyArrayList, isEmptyResultsFromOddNumbersExterminator);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> testArrayList = new ArrayList<Integer>();
        ArrayList<Integer> resultArrayList = new ArrayList<Integer>();

        for(int i = 1; i <= 11; i++) {

            testArrayList.add(i);

        }

        resultArrayList.add(2);
        resultArrayList.add(4);
        resultArrayList.add(6);
        resultArrayList.add(8);
        resultArrayList.add(10);

        //When
        ArrayList<Integer> resultsFromOddNumbersExterminator = oddNumbersExterminator.exterminate(testArrayList);
        System.out.println("Testing " + resultsFromOddNumbersExterminator);

        //Then
        Assert.assertEquals(resultArrayList, resultsFromOddNumbersExterminator);
    }
}


