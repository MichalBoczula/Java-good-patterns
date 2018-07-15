package com.kodilla.good.patterns.challenges.challenge2;

public class User {

    private String username;
    private String pesel;

    public User(String username, String pesel) {
        this.username = username;
        this.pesel = pesel;
    }

    public String getUsername() {
        return username;
    }

    public String getPesel() {
        return pesel;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
