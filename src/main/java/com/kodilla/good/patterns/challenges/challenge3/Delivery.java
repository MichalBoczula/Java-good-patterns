package com.kodilla.good.patterns.challenges.challenge3;

import java.util.HashMap;
import java.util.Map;

public class Delivery implements InformationService, DeliveryService, DeliveryRepository {

    private final Distributor distributor;
    private Map<String, String> suppliersMap = new HashMap<>();

    public Delivery(Distributor distributor) {
        this.distributor = distributor;
        setSuppliers();
    }

    @Override
    public boolean createOrder() {
        return suppliersMap.containsKey(distributor.getProduct());
    }

    @Override
    public String SentMessageToDistributor(String supplier) {
        return "Hello" + distributor.getDistributorName() + "you buy " + distributor.getQuantityOfProduct()
                + "kg " +  distributor.getProduct() + " in " + supplier;
    }

    @Override
    public String process(Distributor distributor) {
        if(createOrder()){
            return suppliersMap.get(distributor.getProduct());
        } else
        return null;
    }

    Distributor getDistributor() {
        return distributor;
    }

    private void setSuppliers(){
        suppliersMap.put("vegetables", "HealthyShop");
        suppliersMap.put("fruits", "ExtraFoodShop");
        suppliersMap.put("grain products", "GlutenFreeShop");
    }
}
