package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] intTable = new int[3];

        for (int i = 0; i < intTable.length; i++){

            intTable[i] = i + 1;

        }

        //When
        OptionalDouble result = ArrayOperations.getAverage(intTable);
        double value = result.getAsDouble();

        //Then
        Assert.assertEquals(2, value, 0);

    }


}
