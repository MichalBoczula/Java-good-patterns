package com.kodilla.good.patterns.challenges.challenge3;

public class Distributor {

    private final String name;
    private final String nipNumber;
    private final String product;
    private final Integer quantityOfProduct;

    Distributor(String name, String nipNumber, String product, Integer quantityOfProduct) {
        this.name = name;
        this.nipNumber = nipNumber;
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
        return "Distributor{" +
                "name='" + name + '\'' +
                ", nipNumber='" + nipNumber + '\'' +
                ", product='" + product + '\'' +
                ", quantityOfProduct=" + quantityOfProduct +
                '}';
    }
}
