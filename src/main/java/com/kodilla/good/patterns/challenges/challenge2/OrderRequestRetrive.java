package com.kodilla.good.patterns.challenges.challenge2;

import java.time.LocalDateTime;

public class OrderRequestRetrive {

    public OrderRequest retrive(){
        final User user = new User("Michał", "111222333");
        final LocalDateTime from = LocalDateTime.of(2018, 7, 1, 12, 0);
        final LocalDateTime to = LocalDateTime.of(2018, 7, 10, 12, 0);
        return new OrderRequest(user, from, to);
    }
}
