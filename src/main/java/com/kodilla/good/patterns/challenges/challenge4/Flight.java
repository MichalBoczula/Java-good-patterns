package com.kodilla.good.patterns.challenges.challenge4;

import java.util.Objects;

public class Flight {

    private final String from;
    private final String to;
    private final String hour;
    private final Boolean withoutChange;

    Flight(String from, String to, String hour, Boolean withoutChange) {
        this.from = from;
        this.to = to;
        this.hour = hour;
        this.withoutChange = withoutChange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(from, flight.from) &&
                Objects.equals(to, flight.to) &&
                Objects.equals(hour, flight.hour);
    }

    @Override
    public int hashCode() {

        return Objects.hash(from, to, hour);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", hour='" + hour + '\'' +
                '}';
    }

    Boolean getWithoutChange() {
        return withoutChange;
    }
}
