
package com.kodilla.challenges.myAllegro;

public class OrderProcessDto {

    public User user;
    public boolean isSold;

    public OrderProcessDto(final User user, final boolean isSold) {
        this.user = user;
        this.isSold = isSold;
    }

    public User getUser() {
        return user;
    }

    public boolean isSold() {
        return isSold;
    }
}