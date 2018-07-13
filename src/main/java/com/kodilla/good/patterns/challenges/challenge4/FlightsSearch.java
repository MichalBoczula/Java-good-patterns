package com.kodilla.good.patterns.challenges.challenge4;

import java.util.ArrayList;
import java.util.List;

class FlightsSearch {

    private final FlightsData  flightsData = new FlightsData();

    List<Flight> findFlights(Boolean withoutChange){
        List<Flight> localList = new ArrayList<>();
        if(withoutChange.equals(true)){
            for (Flight flight : flightsData.getFlighsList()){
                if (flight.getWithoutChange().equals(true)){
                    localList.add(flight);
                }
            }
            return localList;
        }else {
            return flightsData.getFlighsList();
        }
    }
}
