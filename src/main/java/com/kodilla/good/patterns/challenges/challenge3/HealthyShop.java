package com.kodilla.good.patterns.challenges.challenge3;

public class HealthyShop extends Distributor implements SupplierSellProcess {

    HealthyShop(String name, String nipNumber, String product, Integer quantityOfProduct) {
        super(name, nipNumber, product, quantityOfProduct);
    }

    @Override
    public Boolean process(Customer customer) {
        return getProduct().toLowerCase().equals(customer.getProduct().toLowerCase()) &&
                getQuantityOfProduct() >= customer.getQuantityOfProduct();
    }
}
