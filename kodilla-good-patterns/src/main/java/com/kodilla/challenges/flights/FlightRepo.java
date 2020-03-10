package com.kodilla.challenges.flights;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FlightRepo {


    List<Flight> listOfFlights = new ArrayList<>();

    public void addFlightToList(Flight flight){

        listOfFlights.add(flight);

    }

    public void removeFlightFromList(Flight flight){

        listOfFlights.remove(flight);

    }

    public void showAllFlights(){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println("Flight details: ");

        for(int i = 0; i < listOfFlights.size(); i++){

            System.out.println(i +"\nDeparture from: " + listOfFlights.get(i).departureCity + "  " + listOfFlights.get(i).departureDateTime.format(formatter) + "\nDestination: " +  listOfFlights.get(i).arrivalCity +
                    "  "+ listOfFlights.get(i).arrivalDateTime.format(formatter));

        }

    }
}
