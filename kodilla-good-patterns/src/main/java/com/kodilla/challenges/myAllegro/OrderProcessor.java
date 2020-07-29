package com.kodilla.challenges.myAllegro;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderProcessDto process (final OrderRequest orderRequest) {

        boolean isSold = orderService.order(orderRequest.getUser(), orderRequest.getSeller(), orderRequest.getProduct());
        orderRequest.toString();

        if (isSold) {
            informationService.inform(orderRequest.getUser());
            orderService.order(orderRequest.getUser(), orderRequest.getSeller(), orderRequest.getProduct());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getSeller(), orderRequest.getProduct());
            return new OrderProcessDto(orderRequest.getUser(),  true);

        } else {
            return new OrderProcessDto(orderRequest.getUser(),  false);
        }

    }


}
