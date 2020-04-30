package com.kodilla.challenges.myAllegro;

public interface OrderRepository {
    boolean createOrder(User user, Seller seller, Product product);
}
