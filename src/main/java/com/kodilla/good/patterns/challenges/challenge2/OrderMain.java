package com.kodilla.good.patterns.challenges.challenge2;

public class OrderMain {

    public static void main(String[] args){
        final Customer customer1 = new Customer("Michal", "book");
        final Seller seller1 = new Seller("Adam", "book");
        final Order order = new Order(customer1, seller1);
        final ProductOrderService productOrderService = new ProductOrderService(order);

        final OrderDto orderDto =productOrderService.OrderProcess();
        System.out.println(orderDto.toString());
    }
}
