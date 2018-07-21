package com.kodilla.good.patterns.challenges.challenge4;

import java.util.ArrayList;
import java.util.List;

class FlightService {

    private final FlightsData flightsData = new FlightsData();

    List<String> findAllFlightFrom(String from) {
        return new ArrayList<>(flightsData.getMapFlights().get(from));
    }

    List<String> findFlightToWithoutCharge(String to) {
        List<String> localList = new ArrayList<>();
        for (String airport : flightsData.getAirportsList()) {
            if (flightsData.getMapFlights().get(airport).contains(to)) {
                localList.add(airport);
            }
        }
        return localList;
    }

    List<String> findFlightToWithCharge(String from, String to) {
        List<String> localList = new ArrayList<>();
        List<String> listToReturn = new ArrayList<>();
        if (flightsData.getMapFlights().get(from).contains(to)) {
            localList.add(from);
            return localList;
        } else {
            for (String airport : flightsData.getAirportsList()) {
                if (flightsData.getMapFlights().get(airport).contains(to)) {
                    localList.add(airport);
                }
            }
            for (String flight : localList) {
                if (flightsData.getMapFlights().get(flight).contains(from)) {
                    listToReturn.add(from + "-" + flight + "-" + to);
                }
            }
        }
        return listToReturn;
    }

    boolean isFlightAvalieble(String from, String to) {
        List<String> flightsFrom = flightsData.getMapFlights().get(from);
        if (flightsFrom == null) {
            return false;
        }
        if (flightsFrom.contains(to)) {
            return true;
        }
        for (String flight : flightsFrom) {
            if (isFlightAvalieble(flight, to)) {
                return true;
            }

        }
        return false;
    }
}
