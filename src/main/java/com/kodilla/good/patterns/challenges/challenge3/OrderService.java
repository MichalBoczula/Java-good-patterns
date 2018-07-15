package com.kodilla.good.patterns.challenges.challenge3;

class OrderService {

    String order(SupplierSellProcess supplierSellProcess, Customer customer){
        String answer = "You can't buy, sorry";
        if(supplierSellProcess.process(customer)){
            answer = "You buy " + customer.getQuantityOfProduct()+ " kg of " + customer.getProduct();
        }
        return answer;
    }
}