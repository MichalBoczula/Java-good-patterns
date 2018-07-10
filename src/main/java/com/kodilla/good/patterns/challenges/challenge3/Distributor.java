package com.kodilla.good.patterns.challenges.challenge3;

public class Distributor {

    private final String distributorName;
    private final String product;
    private final int quantityOfProduct;

    public Distributor(String distributorName, String product, int quantityOfProduct) {
        this.distributorName = distributorName;
        this.product = product;
        this.quantityOfProduct = quantityOfProduct;
    }

    public String getDistributorName() {
        return distributorName;
    }

    String getProduct() {
        return product;
    }

    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }

    @Override
    public String toString() {
        return "Distributor{" +
                "distributorName='" + distributorName + '\'' +
                ", product='" + product + '\'' +
                ", quantityOfProduct=" + quantityOfProduct +
                '}';
    }
}
