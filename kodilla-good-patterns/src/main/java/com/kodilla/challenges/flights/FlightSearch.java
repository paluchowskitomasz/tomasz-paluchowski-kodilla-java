package com.kodilla.challenges.flights;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FlightSearch {
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    private FlightRepo flightRepo;

    public FlightSearch(FlightRepo flightRepo) {
        this.flightRepo = flightRepo;
    }

    public List<Flight> findFrom(String city) {
        System.out.println(String.format("\nFind - From city: %s", city));
        List<Flight> listofAllFlightsFromCity = flightRepo.getListOfFlights().stream()
                .filter(c -> c.getDepartureCity().equals(city))
                .collect(Collectors.toList());
        return listofAllFlightsFromCity;
    }

    public List<Flight> findTo(String city) {
        System.out.println(String.format("\nFind - To city: %s", city));
        List<Flight> listofAllFlightsToCity = flightRepo.getListOfFlights().stream()
                .filter(c -> c.getArrivalCity().equals(city))
                .collect(Collectors.toList());
        return listofAllFlightsToCity;
    }

    public List<Flight> findBy(String cityFrom, String cityBy, String cityTo) {
        System.out.println(String.format("\nFind - From city: %s, by %s, to %s", cityFrom, cityBy, cityTo));
        return flightRepo.getListOfFlights().stream()
                .filter(f ->
                        (f.getDepartureCity().equals(cityFrom) && f.getArrivalCity().equals(cityBy)) ||
                        (f.getDepartureCity().equals(cityBy) && f.getArrivalCity().equals(cityTo))
                ).collect(Collectors.toList());
    }

    public List<Flight> findByWithDate(String cityFrom, String cityBy, String cityTo) {
        System.out.println(String.format("\nFind - From city: %s, by %s, to %s by date", cityFrom, cityBy, cityTo));
        Optional<Flight> optionalFlight = flightRepo.getListOfFlights().stream()
                .filter(f -> f.getDepartureCity().equals(cityFrom) && f.getArrivalCity().equals(cityBy))
                .min(Comparator.comparing(Flight::getArrivalDateTime));
        if (optionalFlight.isPresent()){
           List<Flight> flights= flightRepo.getListOfFlights().stream()
                    .filter(f->f.getDepartureCity().equals(cityBy) && f.getArrivalCity().equals(cityTo))
                    .filter(f->f.getDepartureDateTime().isAfter(optionalFlight.get().getArrivalDateTime()))
                    .collect(Collectors.toList());
           if (flights.isEmpty()){
               return new ArrayList<>();
           }
            flights.add(optionalFlight.get());
            flights.sort(Comparator.comparing(Flight::getDepartureDateTime));
            return flights;
        }
        else {
            return new ArrayList<>();
        }



    }

}
