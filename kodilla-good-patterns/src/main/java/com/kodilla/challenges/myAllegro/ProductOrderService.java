package com.kodilla.challenges.myAllegro;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductOrderService {

    public static void main(String[] args)  {

        User user1 = new User("Tomasz","Paluchowski","83061511139");
        User user2 = new User("Magdalena","Kowalczyk","83061511239");
        User user3 = new User("Maciej","Maciejski","83061511339");

        Seller seller1 = new Seller("Seller 1","Seller Last Name 1","12345677888");
        Seller seller2 = new Seller("Seller 2","Seller Last Name 2","22345677888");
        Seller seller3 = new Seller("Seller 3","Seller Last Name 3","32345677888");

        List<Product> seller1List = new ArrayList<>();
        seller1List.add(new Product("1","Apples",3));
        seller1List.add(new Product("2","Honey",2));
        seller1List.add(new Product("3","Watch",1));

        List<Product> seller2List = new ArrayList<>();
        seller2List.add(new Product("1","Apples",3));
        seller2List.add(new Product("2","Laptop",2));

        List<Product> seller3List = new ArrayList<>();
        seller3List.add(new Product("1","Table",3));

        ProductRepo newSellerRepo = new ProductRepo();
        newSellerRepo.addSellerWithProductList(seller1, seller1List);
        newSellerRepo.addSellerWithProductList(seller2,seller2List);
        newSellerRepo.addSellerWithProductList(seller3, seller3List);
        newSellerRepo.showSellersAndTheirsProducts();

        ProductBuy buySomething = new ProductBuy(user1);
        buySomething.buy(seller1, new Product("1","Apples",1));



       /* for(Map.Entry entry: userBuyed.entrySet()){

            System.out.println("You are trying to buy buy something from: " + entry.getKey());
            System.out.println("It is: " + entry.getValue());

        }*/

    }


}
