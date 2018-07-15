package com.kodilla.good.patterns.challenges.challenge2;

public class InformationServiceImplementation implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Thank you for buy " + user.getUsername());
    }
}
