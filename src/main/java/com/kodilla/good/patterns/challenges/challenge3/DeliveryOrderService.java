package com.kodilla.good.patterns.challenges.challenge3;

public class DeliveryOrderService {

    private final Delivery delivery;

    public DeliveryOrderService(Delivery delivery) {
        this.delivery = delivery;
    }

    public OrderDto orderProcess(){
        if(delivery.createOrder()){
            delivery.SentMessageToDistributor(delivery.process(delivery.getDistributor()));
            return new OrderDto(delivery.getDistributor(), delivery.process(delivery.getDistributor()),
                    true);
        }else {
            return new OrderDto(delivery.getDistributor(), delivery.process(delivery.getDistributor()),
                    false);
        }
    }
}
