package com.kodilla.good.patterns.challenges.challenge1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieStore {

    private final List<String> ironManTranslations = new ArrayList<>();
    private final List<String> avengersTranslations = new ArrayList<>();
    private final List<String> flashTranslations = new ArrayList<>();
    private Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();

    public MovieStore() {
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);
    }

    public Map<String, List<String>> getMovies() {
        return booksTitlesWithTranslations;
    }
}
