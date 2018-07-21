package com.kodilla.good.patterns.challenges.challenge4;

import java.util.List;

class FlightService {

    private final FlightsData flightsData = new FlightsData();

    boolean isFlightAvailable(String from, String to) {
        List<String> flightsFrom = flightsData.getMapFlights().get(from);
        if (flightsFrom == null) {
            return false;
        }
        if (flightsFrom.contains(to)) {
            return true;
        }
        for (String flight : flightsFrom) {
            if (isFlightAvailable(flight, to)) {
                return true;
            }

        }
        return false;
    }
}
