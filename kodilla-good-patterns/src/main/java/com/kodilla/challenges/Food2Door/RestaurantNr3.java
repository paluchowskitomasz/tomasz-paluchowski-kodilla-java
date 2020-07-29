package com.kodilla.challenges.Food2Door;

public class RestaurantNr3 implements Shop{

    private String restaurantId = "333";
    private String restaurantName = "FoodFromWood";



    public RestaurantNr3(String restaurantId, String restaurantName) {
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
        int warehouseQuantity = 10;
        int warehouseNewQuatntity = warehouseQuantity - warehouseQuantity;

        System.out.println("Updating warhouse data:" + "\nOdered quantity:" + quantity
                + "\nWarehouse Quantity: " + warehouseQuantity
        + "Update warehouse quantity" + warehouseNewQuatntity);

        return new OrderDetails(restaurantId, productName,quantity);
    }
}
