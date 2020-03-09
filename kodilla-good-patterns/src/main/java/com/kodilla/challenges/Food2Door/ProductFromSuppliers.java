package com.kodilla.challenges.Food2Door;

public class ProductFromSuppliers {

    Product product;
    Supplier supplier;
    int quantity;

    public ProductFromSuppliers(Product product, Supplier supplier, int quantity) {
        this.product = product;
        this.supplier = supplier;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ProductFromSuppliers{" +
                "product=" + product +
                ", supplier=" + supplier +
                ", quantity=" + quantity +
                '}';
    }
}
