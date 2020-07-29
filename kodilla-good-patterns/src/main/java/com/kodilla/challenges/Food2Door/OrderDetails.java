package com.kodilla.challenges.Food2Door;

public class OrderDetails {

    private String providerID;
    private String productName;
    private int productQuantity;

    public OrderDetails(String providerName, String productName, int productQuantity) {
        this.providerID = providerName;
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public String getProviderID() {
        return providerID;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}
