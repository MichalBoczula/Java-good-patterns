package com.kodilla.good.patterns.challenges.challenge3;

public class Challenge3Main {

    public static void main(String[] args){

        final ExtraFoodShop extraFoodShop = new ExtraFoodShop("Extra Food Shop", "100",
                "vegetables", 100);
        final GlutenFreeShop glutenFreeShop = new GlutenFreeShop("Glute Free Shop", "200",
                "cereals", 200);
        final HealthyShop healthyShop =new HealthyShop("Healthy Shop", "300",
                "fruits", 300);
        final Customer customer1 = new Customer("zabka", "fruits", 50);
        final Customer customer2 = new Customer("biedronka", "vegetables", 3330);
        final Customer customer3 = new Customer("lidl", "cereals", 200);
        final OrderService orderService = new OrderService();

        System.out.println(orderService.order(healthyShop, customer1));
        System.out.println(orderService.order(extraFoodShop, customer2));
        System.out.println(orderService.order(glutenFreeShop, customer3));
    }
}
