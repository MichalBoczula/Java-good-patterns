package com.kodilla.good.patterns.challenges.challenge2;

public class Challenge2 {

    public static void main(String[] args){
        final OrderRequestRetrive orderRequestRetrive = new OrderRequestRetrive();
        final OrderRequest orderRequest = orderRequestRetrive.retrive();
        final ProductOrderService productOrderService = new ProductOrderService(new InformationServiceImplementation(),
                new OrderServiceImplementation(), new OrderRepositoryImplementation());

        System.out.println(productOrderService.process(orderRequest));
    }
}
