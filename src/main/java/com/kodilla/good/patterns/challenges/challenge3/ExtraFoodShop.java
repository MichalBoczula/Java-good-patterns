package com.kodilla.good.patterns.challenges.challenge3;

public class ExtraFoodShop extends Distributor implements SupplierSellProcess {

    ExtraFoodShop(String name, String nipNumber, String product, Integer quantityOfProduct) {
        super(name, nipNumber, product, quantityOfProduct);
    }

    @Override
    public Boolean process(Customer customer) {
        return getProduct().toLowerCase().equals(customer.getProduct().toLowerCase()) &&
                getQuantityOfProduct() >= customer.getQuantityOfProduct();
    }
}
