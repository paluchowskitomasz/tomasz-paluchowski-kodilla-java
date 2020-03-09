package com.kodilla.challenges.Food2Door;

import java.util.List;

public class Delivery extends ShopWithProducts {


    String supplierName;
    String productName;
    int orderQuantity;

    public void process(List<ProductFromSuppliers> listOfProductsAndSuppliers, String supplierName, String productName, int orderQuantity){

        System.out.println("\nWe are starting with process of buying... \n");

        for (int i = 0; i < listOfProductsAndSuppliers.size(); i++){

            if(listOfProductsAndSuppliers.get(i).product.getProductName() == productName
                    && listOfProductsAndSuppliers.get(i).supplier.getSupplierName() == supplierName
                    && listOfProductsAndSuppliers.get(i).quantity >= orderQuantity){
                System.out.println("\n You have started process of buying...  " + listOfProductsAndSuppliers.get(i).product.getProductName() + " - quantity: " + orderQuantity
                        + " with success!!! Congratulations!!!");
                break;
            } else if (listOfProductsAndSuppliers.get(i).product.getProductName() == productName
                    && listOfProductsAndSuppliers.get(i).supplier.getSupplierName() == supplierName && listOfProductsAndSuppliers.get(i).quantity != 0){
                System.out.println("Product: " + productName + " - You want to buy: " + orderQuantity + " but we have only: " + listOfProductsAndSuppliers.get(i).quantity
                        + "\nChange quantity and try again!!!");
                break;
            } else if (i == listOfProductsAndSuppliers.size()-1){
                System.out.println("\nWe are very sorry but we don't have this kind of product!!!");
            }
        }

        System.out.println("\nThe end!!!");

    }

}
