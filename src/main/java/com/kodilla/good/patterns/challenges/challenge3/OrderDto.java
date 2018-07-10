package com.kodilla.good.patterns.challenges.challenge3;

public class OrderDto {

    private final Distributor distributor;
    private final String supplier;
    private final boolean isSold;

    public OrderDto(Distributor distributor, String supplier, boolean isSold) {
        this.distributor = distributor;
        this.supplier = supplier;
        this.isSold = isSold;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "distributor=" + distributor +
                ", supplier='" + supplier + '\'' +
                ", isSold=" + isSold +
                '}';
    }
}
