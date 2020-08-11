package com.kodilla.challenges.Food2Door;

public class ProjectRunner {


    public static void main(String[] args) {

        Shop extraFoodShop = new ExtraFoodShop();
        Shop healthyShop = new HealthyShop();
        Shop glutenFreeShop = new GlutenFreeShop();
        InformationService informationService = new ConsoleService();
        OrderProcessor orderProcessor = new OrderProcessor(informationService, extraFoodShop);
        orderProcessor.startPorcessingOrder(new OrderDetails("Kebab", 2));
    }

}
