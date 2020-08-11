package com.kodilla.challenges.Food2Door;

import static java.lang.String.format;

public class ConsoleService implements InformationService{

    @Override
    public void inform(ProcessedOrderDetails processedOrderDetails) {

        System.out.println(format("Order name:%s , processed with status %s, on %s time",
                        processedOrderDetails.getOrderDetails().getProductName(),processedOrderDetails.getStatus(),
                        processedOrderDetails.getProcessedDate()));
    }
}
