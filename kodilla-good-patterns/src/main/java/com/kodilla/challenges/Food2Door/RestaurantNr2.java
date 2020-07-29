package com.kodilla.challenges.Food2Door;

public class RestaurantNr2 implements Shop {

    private String restaurantId;
    private String restaurantName;




    public RestaurantNr2(String restaurantId, String restaurantName) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;

    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    @Override
    public OrderDetails process() {
        String productName = "ziemniaki";
        int quantity = 1;

        System.out.println("Sending email to warehouse... " + restaurantName + " - Warehouse");

        return new OrderDetails(restaurantId, productName,quantity);
    }
}
