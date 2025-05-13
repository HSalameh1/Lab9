//------------------------------------------------------
// Lab 9
// Written by: Helwa Salameh [1961163]
// For SE 350 Section 630 – Spring 2025
//--------------------------------------------------------

package org.example.Challenge.Example0.Solution;

public class OrderProcessor {
    private final OrderRepository orderRepository;

    public OrderProcessor(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void processOrder(String orderDetails) {
        System.out.println("Processing order: " + orderDetails);
        orderRepository.saveOrder(orderDetails);
    }
}
