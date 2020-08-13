package com.kodilla.challenges.flights;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Flight {

    private String departureCity;
    private String arrivalCity;
    private LocalDateTime departureDateTime;
    private LocalDateTime arrivalDateTime;

    public Flight(String departureCity, String arrivalCity, LocalDateTime departureDateTime, LocalDateTime arrivalDateTime) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public LocalDateTime getDepartureDateTime() {
        return departureDateTime;
    }

    public LocalDateTime getArrivalDateTime() {
        return arrivalDateTime;
    }

    @Override
    public String toString() {
        return "\nDeparture from: " + departureCity + "  " + departureDateTime + "\nDestination: " + arrivalCity + "  " + arrivalDateTime;
    }
}
