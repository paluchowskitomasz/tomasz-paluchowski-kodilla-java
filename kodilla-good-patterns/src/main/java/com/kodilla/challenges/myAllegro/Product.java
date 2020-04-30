package com.kodilla.challenges.myAllegro;

import java.util.Objects;

public class Product {

    private String productID;
    private String productName;
    private int productQuantity;

    public Product(String productID, String productName, int productQuantity) {
        this.productID = productID;
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public String getProductID() {

        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

}
