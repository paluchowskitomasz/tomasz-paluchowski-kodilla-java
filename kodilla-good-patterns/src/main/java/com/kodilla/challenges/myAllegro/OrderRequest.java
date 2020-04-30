package com.kodilla.challenges.myAllegro;

public class OrderRequest {

    private User user;
    private Seller seller;
    private Product product;

    public OrderRequest(User user, Seller seller, Product product) {
        this.user = user;
        this.seller = seller;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public Seller getSeller() {
        return seller;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "user=" + user +
                ", seller=" + seller +
                ", product=" + product +
                '}';
    }
}
