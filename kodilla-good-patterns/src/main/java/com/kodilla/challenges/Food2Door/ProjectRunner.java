package com.kodilla.challenges.Food2Door;

import com.kodilla.challenges.MovieStore;

import java.util.stream.Collectors;

public class ProjectRunner {


    public static void main(String[] args) {

        Product prod1 = new Product("1", "Milk");
        Product prod2 = new Product("2", "Honey");
        Product prod3 = new Product("3", "Flower");

        Supplier sup1 = new Supplier("1", "Food from the village");
        Supplier sup2 = new Supplier("2", "Nature Firstly");
        Supplier sup3 = new Supplier("3", "Good Food");

        ProductFromSuppliers prodFromSup1 = new ProductFromSuppliers(prod1, sup1, 1);
        ProductFromSuppliers prodFromSup2 = new ProductFromSuppliers(prod2, sup1, 3);
        ProductFromSuppliers prodFromSup3 = new ProductFromSuppliers(prod3, sup2, 4);
        ProductFromSuppliers prodFromSup4 = new ProductFromSuppliers(prod2, sup3, 3);

        ShopWithProducts newShop = new ShopWithProducts();

        newShop.addSomethingToShop(prodFromSup2);
        newShop.addSomethingToShop(prodFromSup3);
        newShop.addSomethingToShop(prodFromSup1);
        newShop.addSomethingToShop(prodFromSup4);
        newShop.showProductInTheShop();

        Delivery newDelivery = new Delivery();
        newDelivery.process(newShop.shopListOfProd, "Food from the village", "Milk", 1);
    }

}
