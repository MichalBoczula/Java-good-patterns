package com.kodilla.good.patterns.challenges.challenge4;

public class Challenge4Main {

    public static void main(String[] args){
        final FlightService flightService = new FlightService();
        System.out.println(flightService.isFlightAvailable("warsaw", "london"));
    }
}
