package com.kodilla.challenges.flights;

import com.kodilla.challenges.Food2Door.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FlightRunner {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        Flight flight1 = new Flight("Warszawa","Gdansk",
               LocalDateTime.of(2020,01,01,20,00),LocalDateTime.of(2020,01,01,21,00));
        Flight flight2 = new Flight("Gdansk","Lodz",
                LocalDateTime.of(2020,01,01,22,00),LocalDateTime.of(2020,01,01,23,00));
        Flight flight3 = new Flight("Lodz","Rzeszow",
                LocalDateTime.of(2020,01,02,02,00),LocalDateTime.of(2020,01,02,03,00));
        Flight flight4 = new Flight("Katowice","Szczecin",
                LocalDateTime.of(2020,05,01,21,00),LocalDateTime.of(2020,05,01,23,00));
        Flight flight5 = new Flight("Warszawa","Wroclaw",
                LocalDateTime.of(2020,06,01,04,00),LocalDateTime.of(2020,01,01,20,00));

        FlightRepo newFlightRepo = new FlightRepo();
        newFlightRepo.addFlightToList(flight1);
        newFlightRepo.addFlightToList(flight2);
        newFlightRepo.addFlightToList(flight3);
        newFlightRepo.addFlightToList(flight4);
        newFlightRepo.addFlightToList(flight5);

        System.out.println("\nFind - From city: Warszawa");
        List<String> listofAllFlightsFromCity = newFlightRepo.listOfFlights.stream()
                .filter(c -> c.departureCity == "Warszawa")
                .map(m -> "\nDeparture from: " + m.departureCity + "  " + m.departureDateTime.format(formatter) + "\nDestination: " + m.arrivalCity + "  " + m.arrivalDateTime.format(formatter))
                .collect(Collectors.toList());

        listofAllFlightsFromCity.forEach(x -> System.out.println(x));

        System.out.println("\nFind - To city - Szczecin:");
        List<String> listofAllFlightsToCity = newFlightRepo.listOfFlights.stream()
                .filter(c -> c.arrivalCity == "Szczecin")
                .map(m -> "\nDeparture from: " + m.departureCity + "  " + m.departureDateTime.format(formatter) + "\nDestination: " + m.arrivalCity + "  " + m.arrivalDateTime.format(formatter))
                .collect(Collectors.toList());

        listofAllFlightsToCity.forEach(x -> System.out.println(x));

        System.out.println("\nFind - From city: Warsaw to Lodz with transfer in Gdansk");
        List<String> listofFlightsWithTransfer = newFlightRepo.listOfFlights.stream()
                .filter(c -> c.departureCity == "Warszawa" || c.arrivalCity == "Lodz")
                .map(m -> "\nDeparture from: " + m.departureCity + "  " + m.departureDateTime.format(formatter) + "\nDestination: " + m.arrivalCity + "  " + m.arrivalDateTime.format(formatter))
                .collect(Collectors.toList());
        listofFlightsWithTransfer.forEach(x -> System.out.println(x));


    }

}
