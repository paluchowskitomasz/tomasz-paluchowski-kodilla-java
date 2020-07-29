package com.kodilla.challenges.myAllegro;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user1 = new User("Tomasz", "Paluchowski", "83061511139");
        Seller seller1 = new Seller("Seller 1", "Seller Last Name 1", "12345677888");
        Product product1 = new Product("1", "apples", 20);

        return new OrderRequest(user1, seller1, product1);
    }
}
