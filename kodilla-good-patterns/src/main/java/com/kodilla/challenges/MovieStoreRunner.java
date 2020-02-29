package com.kodilla.challenges;

import com.kodilla.challenges.MovieStore;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import java.util.Set;
import java.util.stream.*;

public class MovieStoreRunner {

    public static void main(String[] args)  {

        MovieStore newStore = new MovieStore();

       String listOfTitlesSeparateByExclamationMark = newStore.getMovies().entrySet().stream()
                .flatMap(f -> f.getValue().stream())
                .map(s -> String.valueOf(s))
                .collect(Collectors.joining(" ! "));

        System.out.println(listOfTitlesSeparateByExclamationMark);

    }


}
