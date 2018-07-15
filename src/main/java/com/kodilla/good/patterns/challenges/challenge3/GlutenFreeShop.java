package com.kodilla.good.patterns.challenges.challenge3;

public class GlutenFreeShop extends Distributor implements  SupplierSellProcess {

    GlutenFreeShop(String name, String nipNumber, String product, Integer quantityOfProduct) {
        super(name, nipNumber, product, quantityOfProduct);
    }

    @Override
    public Boolean process(Customer customer) {
        return getProduct().toLowerCase().equals(customer.getProduct().toLowerCase()) &&
                getQuantityOfProduct() >= customer.getQuantityOfProduct();
    }
}
