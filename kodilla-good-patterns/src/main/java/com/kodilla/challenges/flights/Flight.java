package com.kodilla.challenges.flights;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Flight {

    String departureCity;
    String arrivalCity;
    LocalDateTime departureDateTime;
    LocalDateTime arrivalDateTime;

    public Flight(String departureCity, String arrivalCity, LocalDateTime departureDateTime, LocalDateTime arrivalDateTime) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
    }

}
