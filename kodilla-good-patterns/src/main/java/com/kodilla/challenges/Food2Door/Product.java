package com.kodilla.challenges.Food2Door;

public class Product {

    private String productID;
    private String productName;

    public Product(String productID, String productName) {
        this.productID = productID;
        this.productName = productName;
    }

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }
}
