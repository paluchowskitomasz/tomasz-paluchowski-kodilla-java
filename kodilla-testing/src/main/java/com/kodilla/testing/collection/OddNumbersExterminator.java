package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> newArrayList = new ArrayList<Integer>();

        for (int i = 0; i <= numbers.size()-1; i++) {

            if (numbers.get(i) % 2 == 0) newArrayList.add(numbers.get(i));
        }

        return newArrayList;
    }
}
