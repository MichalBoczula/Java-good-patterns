package com.kodilla.good.patterns.challenges.challenge2;

public class Customer {

    private String username;
    private String product;

    public Customer(final String username, final String product) {
        this.username = username;
        this.product = product;
    }

    public String getUsername() {
        return username;
    }

    public String getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "username='" + username + '\'' +
                ", product='" + product + '\'' +
                '}';
    }
}
