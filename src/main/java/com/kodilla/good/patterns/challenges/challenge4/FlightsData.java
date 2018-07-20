package com.kodilla.good.patterns.challenges.challenge4;

import java.util.*;

class FlightsData {

    private String warsaw = "warsaw";
    private List<String> warsawFlights = new ArrayList<>();
    private String berlin = "berlin";
    private List<String> berlinFlights = new ArrayList<>();
    private String prague = "prague";
    private List<String> pragueFlights = new ArrayList<>();
    private String munich = "munich";
    private List<String> munichFlights = new ArrayList<>();
    private Map<String, List<String>> mapFlights = new HashMap<>();
    private final List<String> airportsList = new ArrayList<>();

    FlightsData() {
        setBerlinFlightsData();
        setMunichFlightsData();
        setPragueFlightsData();
        setWarsawFlightsData();
        setAirportsList();
    }
    Map<String, List<String>> getMapFlights() {
        return mapFlights;
    }
    private void setWarsawFlightsData() {
        warsawFlights.add("berlin");
        warsawFlights.add("wroclaw");
        warsawFlights.add("prague");
        warsawFlights.add("gdansk");
        warsawFlights.add("crakow");

        mapFlights.put(warsaw, warsawFlights);
    }
    private void setBerlinFlightsData() {
        berlinFlights.add("warsaw");
        berlinFlights.add("madrid");
        berlinFlights.add("paris");
        berlinFlights.add("london");
        berlinFlights.add("roma");

        mapFlights.put(berlin, berlinFlights);
    }
    private void setPragueFlightsData() {
        pragueFlights.add("berlin");
        pragueFlights.add("warsaw");
        pragueFlights.add("paris");
        pragueFlights.add("madrid");
        pragueFlights.add("london");

        mapFlights.put(prague, pragueFlights);
    }
    private void setMunichFlightsData() {
        munichFlights.add("berlin");
        munichFlights.add("warsaw");
        munichFlights.add("paris");
        munichFlights.add("london");
        munichFlights.add("prague");

        mapFlights.put(munich, munichFlights);
    }
    private void setAirportsList(){
        airportsList.add(warsaw);
        airportsList.add(berlin);
        airportsList.add(prague);
        airportsList.add(munich);
    }
    List<String> getAirportsList() {
        return airportsList;
    }
}
