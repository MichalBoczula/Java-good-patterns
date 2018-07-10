package com.kodilla.good.patterns.challenges.challenge2;

public class Seller {

    private String sellername;
    private String product;

    public Seller(String sellerName, String product) {
        this.sellername = sellerName;
        this.product = product;
    }

    public String getSellerName() {
        return sellername;
    }

    public String getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "sellername='" + sellername + '\'' +
                ", product='" + product + '\'' +
                '}';
    }
}
