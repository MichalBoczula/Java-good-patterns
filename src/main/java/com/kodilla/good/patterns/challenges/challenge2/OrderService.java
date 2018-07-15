package com.kodilla.good.patterns.challenges.challenge2;

import java.time.LocalDateTime;

public interface OrderService {

    boolean order(User user, LocalDateTime from, LocalDateTime to);
}
