package com.kodilla.challenges.Food2Door;



public class OrderProcessor {

    private InformationService informationService;
    private OrderDetails orderDetails;

    public OrderProcessor(InformationService informationService, OrderDetails orderDetails) {
        this.informationService = informationService;
        this.orderDetails = orderDetails;
    }


}
