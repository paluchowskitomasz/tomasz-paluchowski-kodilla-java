package com.kodilla.challenges.myAllegro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class ProductBuy extends ProductRepo {

    User user;

    public ProductBuy(User user){
        this.user = user;
    };

    public Map<Seller, List<Product>> buy(Seller seller, Product product) {


        System.out.println( user.userName + " " + user.userLastName + " is trying to buy " + product.productName + " - quantity: " + product.productQuantity
                + " from: " + seller.sellerFirstName + " " + seller.sellerLastName +".");



        return mapOfSellersAndTheirsProducts;
    }
}
