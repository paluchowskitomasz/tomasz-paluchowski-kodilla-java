package com.kodilla.challenges.flights;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FlightRepo {
    private List<Flight> listOfFlights;

    public FlightRepo() {

        listOfFlights = new ArrayList<Flight>() {{
            add(new Flight("Warszawa", "Gdansk",
                    LocalDateTime.of(2020, 01, 01, 20, 00)
                    , LocalDateTime.of(2020, 01, 01, 23, 00)));
            add(new Flight("Gdansk", "Lodz",
                    LocalDateTime.of(2020, 01, 01, 22, 00)
                    , LocalDateTime.of(2020, 01, 01, 23, 00)));
            add(new Flight("Lodz", "Rzeszow",
                    LocalDateTime.of(2020, 01, 02, 02, 00),
                    LocalDateTime.of(2020, 01, 02, 03, 00)));
            add(new Flight("Katowice", "Szczecin",
                    LocalDateTime.of(2020, 05, 01, 21, 00),
                    LocalDateTime.of(2020, 05, 01, 23, 00)));
            add(new Flight("Warszawa", "Wroclaw",
                    LocalDateTime.of(2020, 06, 01, 04, 00),
                    LocalDateTime.of(2020, 01, 01, 20, 00)));
        }};
    }

    public List<Flight> getListOfFlights() {

        return listOfFlights;
    }

    public void addFlightToList(Flight flight) {

        listOfFlights.add(flight);

    }

    public void removeFlightFromList(Flight flight) {

        listOfFlights.remove(flight);

    }

//    public void showAllFlights() {
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//        System.out.println("Flight details: ");
//
//        for (int i = 0; i < listOfFlights.size(); i++) {
//
//            System.out.println(i + "\nDeparture from: " + listOfFlights.get(i).departureCity + "  " + listOfFlights.get(i).departureDateTime.format(formatter) + "\nDestination: " + listOfFlights.get(i).arrivalCity +
//                    "  " + listOfFlights.get(i).arrivalDateTime.format(formatter));
//
//        }

    }

