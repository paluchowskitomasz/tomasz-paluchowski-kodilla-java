package com.kodilla.challenges.myAllegro;

public class AllegroOrderRepository implements  OrderRepository{


    @Override
    public boolean createOrder(User user, Seller seller, Product product) {
        return false;
    }
}
