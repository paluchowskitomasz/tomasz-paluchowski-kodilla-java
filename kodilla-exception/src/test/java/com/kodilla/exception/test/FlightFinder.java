package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airportStatus = new HashMap<String, Boolean>();

        airportStatus.put("Warsaw", false);
        airportStatus.put("Madrit", true);
        airportStatus.put("London", false);
        airportStatus.put("Liverpool", true);
        airportStatus.put("Rome", false);

        if (airportStatus.containsKey(flight.arrivalAirport) &&  airportStatus.get(flight.arrivalAirport) == true) {

            System.out.println("Flight to: " + flight.getArrivalAirport() + "\nAirport available! " + "\nAirport status:" + airportStatus.toString());

        } else if (airportStatus.containsKey(flight.arrivalAirport) &&  airportStatus.get(flight.arrivalAirport) == false) {

            System.out.println("Flight to: " + flight.getArrivalAirport() + "\nAirport NOT available! " + "\nAirport status:" + airportStatus.toString());

        } else {

                throw new RouteNotFoundException("Object AIRPORT was null!");

        }

    }

}

