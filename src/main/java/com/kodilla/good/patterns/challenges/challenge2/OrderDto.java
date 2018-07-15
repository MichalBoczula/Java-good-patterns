package com.kodilla.good.patterns.challenges.challenge2;

public class OrderDto {

    private User user;
    private boolean isOrder;

    public OrderDto(User user, boolean isOrder) {
        this.user = user;
        this.isOrder = isOrder;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrder() {
        return isOrder;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "user=" + user +
                ", isOrder=" + isOrder +
                '}';
    }
}
