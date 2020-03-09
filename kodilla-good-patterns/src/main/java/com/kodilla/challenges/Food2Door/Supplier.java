package com.kodilla.challenges.Food2Door;

public class Supplier {

    private String supplierID;
    private String supplierName;

    public Supplier(String supplierID, String supplierName) {
        this.supplierID = supplierID;
        this.supplierName = supplierName;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public String getSupplierName() {
        return supplierName;
    }
}
