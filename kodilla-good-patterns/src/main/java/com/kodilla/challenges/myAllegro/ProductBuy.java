package com.kodilla.challenges.myAllegro;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class ProductBuy extends ProductRepo {

    User user;

    public ProductBuy(User user){
        this.user = user;
    };

    public void buySomething(Map<Seller, List<Product>> productsOnMyAllegro, Seller seller, Product product) {


        System.out.println( "\n" + user.getUserName() + " " + user.getUserLastName() + " is trying to buy " + product.getProductName() + " - quantity: " + product.getProductQuantity()
                + " from: " + seller.getSellerFirstName() + " " + seller.getSellerLastName() +".");

        System.out.println("\nI am starting checking avaiability of product...");

        List<String> list = productsOnMyAllegro.entrySet().stream()
                .filter(s -> s.getKey() == seller)
                .flatMap(v -> v.getValue().stream())
                .filter(f -> f.getProductName() == product.getProductName())
                .map(m -> m.getProductName() + " " + m.getProductQuantity())
                .collect(Collectors.toList());

        if(list.size() != 0) {
            System.out.println("We have: " + list);
            System.out.println("You have bought it! Success!");
        } else {
            System.out.println("We don't have this product!");
        }

    }
}
