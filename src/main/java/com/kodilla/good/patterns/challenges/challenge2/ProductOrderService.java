package com.kodilla.good.patterns.challenges.challenge2;

public class ProductOrderService {

    private final Order order;

    public ProductOrderService(Order order) {
        this.order = order;
    }

    public OrderDto OrderProcess(){
        boolean isSold = order.sell();
        if (isSold){

            order.sendMessageToCustomer();
            order.sendMessageToSeller();
            return new OrderDto(order.getCustomer(), order.getSeller(), true);
        } else{
            return new OrderDto(order.getCustomer(), order.getSeller(), false);
        }
    }
}
