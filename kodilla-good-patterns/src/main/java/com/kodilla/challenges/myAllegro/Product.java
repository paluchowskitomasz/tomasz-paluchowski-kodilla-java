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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product that = (Product) o;
        return Objects.equals(productID, that.productID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productID);
    }

    @Override
    public String toString() {
        return "ProductOrderProduct{" +
                "productID='" + productID + '\'' +
                ", productName='" + productName + '\'' +
                ", productQuantity=" + productQuantity +
                '}';
    }
}
