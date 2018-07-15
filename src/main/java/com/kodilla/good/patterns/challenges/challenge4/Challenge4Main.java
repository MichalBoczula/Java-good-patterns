package com.kodilla.good.patterns.challenges.challenge4;

public class Challenge4Main {

    public static void main(String[] args){
        final FlightsSearch flightsSearch = new FlightsSearch();

        flightsSearch.findFlights(true).stream()
                .forEach(System.out::println);

        //możliwe loty znajdz mi lot z warszawy do nowego roku
        //mapa from to,
        //rekurencja!!!
        //metoda szuka lotów
        //klucz w mapie String value List
        //każda klucz ma liste
    }
}
