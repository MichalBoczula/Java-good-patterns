package com.kodilla.good.patterns.challenges.challenge1;

import java.util.stream.Collectors;

public class MovieMain {

    public static void main(String[] args){
        final MovieStore movieStore = new MovieStore();

        String result = movieStore.getMovies().entrySet().stream()
                .map(entry -> entry.getKey()+": "+entry.getValue())
                .collect(Collectors.joining(" ! "));

        System.out.println(result);
    }
}
