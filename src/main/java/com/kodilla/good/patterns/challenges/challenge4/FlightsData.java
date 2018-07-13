package com.kodilla.good.patterns.challenges.challenge4;

import java.util.ArrayList;
import java.util.List;

class FlightsData {

    private final List<Flight> flighsList = new ArrayList<>();

    FlightsData() {
        setFlightsList();
    }

    private void setFlightsList(){
        final Flight flight1 = new Flight("wroclaw", "warsow", "8:00", true);
        final FlightWithChange flightWithChange1 = new FlightWithChange("wroclaw",
                "warsow", "9:00", false, "crakow", "10:00");
        final Flight flight2 = new Flight("wroclaw", "gdansk", "12:00", true);
        final FlightWithChange flightWithChange2 = new FlightWithChange("wroclaw",
                "warsow", "13:00", false, "crakow", "14:00");
        final Flight flight3 = new Flight("wroclaw", "warsow", "16:00", true);
        final FlightWithChange flightWithChange3 = new FlightWithChange("wroclaw",
                "gdansk", "17:00", false, "poznan", "18:00");
        final Flight flight4 = new Flight("wroclaw", "gdansk", "20:00", true);
        final FlightWithChange flightWithChange4 = new FlightWithChange("wroclaw",
                "gdansk", "21:00", false, "poznan", "22:00");

        flighsList.add(flight1);
        flighsList.add(flight2);
        flighsList.add(flight3);
        flighsList.add(flight4);

        flighsList.add(flightWithChange1);
        flighsList.add(flightWithChange2);
        flighsList.add(flightWithChange3);
        flighsList.add(flightWithChange4);
    }

    List<Flight> getFlighsList() {
        return flighsList;
    }
}
