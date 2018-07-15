package com.kodilla.good.patterns.challenges.challenge3;

public class Customer {

    private final String name;
    private final String product;
    private final Integer quantityOfProduct;

    public Customer(String name, String product, Integer quantityOfProduct) {
        this.name = name;
        this.product = product;
        this.quantityOfProduct = quantityOfProduct;
    }

    String getProduct() {
        return product;
    }

    Integer getQuantityOfProduct() {
        return quantityOfProduct;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", product='" + product + '\'' +
                ", quantityOfProduct=" + quantityOfProduct +
                '}';
    }
}
