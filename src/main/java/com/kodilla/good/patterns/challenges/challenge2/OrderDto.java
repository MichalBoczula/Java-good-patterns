package com.kodilla.good.patterns.challenges.challenge2;

public class OrderDto {

    private Customer customer;
    private Seller seller;
    private boolean isSold;

    public OrderDto(Customer customer, Seller seller, boolean isSold) {
        this.customer = customer;
        this.seller = seller;
        this.isSold = isSold;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Seller getSeller() {
        return seller;
    }

    public boolean isSold() {
        return isSold;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "customer=" + customer +
                ", seller=" + seller +
                ", isSold=" + isSold +
                '}';
    }
}
