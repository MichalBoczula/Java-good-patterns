package com.kodilla.good.patterns.challenges.challenge1;

public class MovieMain {

    public static void main(String[] args){
        final MovieStore movieStore = new MovieStore();

        movieStore.getMovies().entrySet().stream()
                .map(entry -> entry.getKey()+": "+entry.getValue())
                .forEach(e -> System.out.print(e+" ! "));
    }
}
