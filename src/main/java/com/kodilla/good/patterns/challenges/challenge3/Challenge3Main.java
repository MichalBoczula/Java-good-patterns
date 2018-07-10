package com.kodilla.good.patterns.challenges.challenge3;

public class Challenge3Main {

    public static void main(String[] args){
        final Delivery delivery = new Delivery(new Distributor("Warzywniak biedronka",
                "fruits", 100));
        final DeliveryOrderService deliveryOrderService = new DeliveryOrderService(delivery);

        System.out.println(deliveryOrderService.orderProcess().toString());
    }
}
