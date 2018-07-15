package com.kodilla.good.patterns.challenges.challenge2;

import java.time.LocalDateTime;

public class OrderRepositoryImplementation implements OrderRepository {

    @Override
    public boolean createOrder(User user, LocalDateTime from, LocalDateTime to) {
        return true;
    }
}
