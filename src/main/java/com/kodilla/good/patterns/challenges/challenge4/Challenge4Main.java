package com.kodilla.good.patterns.challenges.challenge4;

public class Challenge4Main {

    public static void main(String[] args){
        final FlightService flightService = new FlightService();
        flightService.findAllFlightFrom("berlin").stream()
                .forEach(System.out::println);
        flightService.findFlightToWithoutCharge("warsaw").stream()
                .forEach(System.out::println);
        flightService.findFlightToWithCharge("warsaw", "london").stream()
                .forEach(System.out::println);
        System.out.println(flightService.isFlightAvalieble("warsaw", "london"));
    }
}
