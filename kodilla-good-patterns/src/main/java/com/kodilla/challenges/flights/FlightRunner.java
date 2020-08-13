package com.kodilla.challenges.flights;

import com.kodilla.challenges.Food2Door.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FlightRunner {

    public static final String WARSZAWA = "Warszawa";
    public static final String GDANSK = "Gdansk";
    public static final String LODZ = "Lodz";
    public static final String WROCLAW = "Wroclaw";

    public static void main(String[] args) {


        FlightRepo newFlightRepo = new FlightRepo();

        FlightSearch flightSearch = new FlightSearch(newFlightRepo);

        flightSearch.findFrom(WARSZAWA).forEach(System.out::println);

        flightSearch.findTo(WROCLAW).forEach(System.out::println);
        flightSearch.findBy(WARSZAWA, GDANSK, LODZ).forEach(System.out::println);
        flightSearch.findByWithDate(WARSZAWA, GDANSK, LODZ).forEach(System.out::println);
    }

}
