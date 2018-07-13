package com.kodilla.good.patterns.challenges.challenge4;

import java.util.Objects;

public class FlightWithChange extends Flight {

    private final String whereIsChange;
    private final String hourOfChange;

    FlightWithChange(String from, String to, String hour, Boolean withoutChange, String whereIsChange, String hourOfChange) {
        super(from, to, hour, withoutChange);
        this.whereIsChange = whereIsChange;
        this.hourOfChange = hourOfChange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FlightWithChange that = (FlightWithChange) o;
        return Objects.equals(whereIsChange, that.whereIsChange) &&
                Objects.equals(hourOfChange, that.hourOfChange);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), whereIsChange, hourOfChange);
    }

    @Override
    public String toString() {
        return "FlightWithChange{" +super.toString()+" "+
                "whereIsChange='" + whereIsChange + '\'' +
                ", hourOfChange='" + hourOfChange + '\'' +
                '}';
    }
}
