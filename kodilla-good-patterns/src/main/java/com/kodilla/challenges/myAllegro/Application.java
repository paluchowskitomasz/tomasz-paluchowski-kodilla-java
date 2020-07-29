package com.kodilla.challenges.myAllegro;

public class Application {

    public static void main(String[] args)  {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new ProductOrderService(),
                new AllegroOrderRepository());

        orderProcessor.process(orderRequest);

    }


}
