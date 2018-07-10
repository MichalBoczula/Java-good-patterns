package com.kodilla.good.patterns.challenges.challenge2;

public class Order implements InformationService, OrderRepository, OrderService {

    private final Customer customer;
    private final Seller seller;

    public Order(Customer customer, Seller seller) {
        this.customer = customer;
        this.seller = seller;
    }

    @Override
    public String sendMessageToCustomer() {
        return "Hello "+customer.getUsername()+" your order " + customer.getProduct() + " is created";
    }

    @Override
    public String sendMessageToSeller() {
        return seller.getSellerName() + ": your product "+ seller.getProduct() + " was buy";
    }

    @Override
    public boolean createOrder() {
        return customer.getProduct().equals(seller.getProduct());
    }

    @Override
    public boolean sell() {
        return createOrder();
    }

    public Customer getCustomer() {
        return customer;
    }

    public Seller getSeller() {
        return seller;
    }
}
