package com.kodilla.challenges.Food2Door;

public class RestaurantNr1 implements Shop {

    private String restaurantId ;
    private String restaurantName;



    public RestaurantNr1(String restaurantId, String restaurantName) {
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

        boolean isAvailable = true;

        if (isAvailable) {
            String productName = "kapusta";
            int quantity = 10;

            return new OrderDetails(restaurantId, productName, quantity);
        } else {
            return new OrderDetails(restaurantId, "product unavailable", 0);
        }
    }
}
