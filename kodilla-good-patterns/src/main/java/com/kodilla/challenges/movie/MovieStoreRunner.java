package com.kodilla.challenges.movie;

import com.kodilla.challenges.movie.MovieStore;

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
