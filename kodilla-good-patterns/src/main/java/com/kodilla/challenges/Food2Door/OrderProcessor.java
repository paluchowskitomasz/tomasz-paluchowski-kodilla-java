package com.kodilla.challenges.Food2Door;



import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;


public class OrderProcessor {

    private   InformationService informationService;
    private   Shop shop;

    public OrderProcessor(InformationService informationService, Shop shop) {
        this.informationService = informationService;
        this.shop = shop;
    }

    public void startPorcessingOrder(OrderDetails orderDetails) {
        ProcessedOrderDetails processedOrderDetails = shop.process(orderDetails);
        informationService.inform(processedOrderDetails);
    }
}
