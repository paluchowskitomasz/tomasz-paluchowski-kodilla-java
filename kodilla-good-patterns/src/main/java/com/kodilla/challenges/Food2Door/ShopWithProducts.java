package com.kodilla.challenges.Food2Door;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShopWithProducts {

    List<ProductFromSuppliers> shopListOfProd = new ArrayList<>();

    public void addSomethingToShop(ProductFromSuppliers productFromSupplier){

        shopListOfProd.add(productFromSupplier);

    }

    public void showProductInTheShop() {

        System.out.println("\nProduct in the shop: \n");

        for(int i = 0; i < shopListOfProd.size(); i++){

            String productName = shopListOfProd.get(i).product.getProductName();
            String supplierName = shopListOfProd.get(i).supplier.getSupplierName();
            int productQuantity = shopListOfProd.get(i).quantity;


            System.out.println("Product name: " + productName
                    + " ->> Producer: " + supplierName
                    + " ->> Quantity: " + productQuantity);


        }

    }
}
