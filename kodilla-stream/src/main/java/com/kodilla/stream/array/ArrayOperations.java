package com.kodilla.stream.array;

import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static OptionalDouble getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
               .map(n-> numbers[n])
               .forEach(System.out::println);

        OptionalDouble averegeFromArray = IntStream.range(0, numbers.length)
                .map(n-> numbers[n])
                .average();

        System.out.println("Average: " + averegeFromArray);

        return averegeFromArray;
    }

}
