package com.kodilla.challenges.Food2Door;

import java.util.Date;

public class ExtraFoodShop implements Shop {

    private String restaurantId="2" ;
    private String restaurantName="ExtraFoodShop sp z o. o.";

    public String getRestaurantId() {
        return restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }


    @Override
    public ProcessedOrderDetails process(OrderDetails orderDetails) {
        System.out.println(String.format("Restarurant %s , processing order %s",this.restaurantName,orderDetails.getProductName()));
        ProcessedOrderDetails processedOrderDetails= new ProcessedOrderDetails(Status.Completed,orderDetails,new Date());
        return processedOrderDetails;
    }
}
