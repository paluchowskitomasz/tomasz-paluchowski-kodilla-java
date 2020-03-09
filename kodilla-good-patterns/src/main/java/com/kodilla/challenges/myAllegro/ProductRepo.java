package com.kodilla.challenges.myAllegro;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductRepo implements ProductRepoInterface {

    Map<Seller, List<Product>> mapOfSellersAndTheirsProducts = new HashMap<>();

    public Map<Seller, List<Product>> getMapOfSellersAndTheirsProducts() {
        return mapOfSellersAndTheirsProducts;
    }

    @Override
    public void addSellerWithProductList(Seller seller, List<Product> productListSeller){

        mapOfSellersAndTheirsProducts.put(seller,productListSeller);

    }

    @Override
    public void removeSellerWithProductList(Seller seller, List<Product> productListSeller){

        mapOfSellersAndTheirsProducts.remove(seller,productListSeller);

    }

    public void showSellersAndTheirsProducts(){

        for(Map.Entry<Seller, List<Product>> entry: mapOfSellersAndTheirsProducts.entrySet()){

            Seller key = entry.getKey();
            String value = entry.getValue().stream()
                    .map(s -> String.valueOf("\nID: " + s.getProductID() + ", Name of product: "+ s.getProductName() + ", Quantity: " + s.getProductQuantity()))
                    .collect(Collectors.joining());

            String sellerID = key.getSellerPesel();
            String sellerFirstName = key.getSellerFirstName();
            String sellerLastName = key.getSellerLastName();

            System.out.println("\nInformation about seller: \n" + "Name: " + sellerFirstName + ", Surname: " + sellerLastName + ", ID: " + sellerID);
            System.out.println("\nProduct list: " + value);

        }

    }
}
