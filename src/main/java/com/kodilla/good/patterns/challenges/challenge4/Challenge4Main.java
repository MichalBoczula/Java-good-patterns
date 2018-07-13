package com.kodilla.good.patterns.challenges.challenge4;

public class Challenge4Main {

    public static void main(String[] args){
        final FlightsSearch flightsSearch = new FlightsSearch();

        flightsSearch.findFlights(true).stream()
                .forEach(System.out::println);
    }
}
