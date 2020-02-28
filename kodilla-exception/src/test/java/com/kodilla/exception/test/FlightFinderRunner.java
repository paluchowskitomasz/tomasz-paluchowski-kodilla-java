package com.kodilla.exception.test;

import com.kodilla.exception.index.VideoCollector;

import java.util.List;

public class FlightFinderRunner {


    public static void main(String[] args)  {


        Flight flight1 = new Flight("Warsaw","Madrit");
        Flight flight2 = new Flight("Madrit","Rome");
        Flight flight3 = new Flight("London","Liverpool");
        Flight flight3WithoutAirport = new Flight("Warsaw","Phuket");


        FlightFinder flightCheck = new FlightFinder();

        try {

            flightCheck.findFlight(flight1);
            flightCheck.findFlight(flight3WithoutAirport);
            flightCheck.findFlight(flight2);
            flightCheck.findFlight(flight3);

        } catch (RouteNotFoundException e){

            System.out.println("Airport problem! \n" + e);

        }

    }

}
