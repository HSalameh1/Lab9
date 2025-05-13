//------------------------------------------------------
// Lab 9
// Written by: Helwa Salameh [1961163]
// For SE 350 Section 630 – Spring 2025
//--------------------------------------------------------

package org.example.Challenge.Example0.Solution;

public class Main {
    public static void main(String[] args) {
        // Dependency Injection: passing the repository to the order processor
        OrderRepository orderRepository = new DatabaseOrderRepository();
        OrderProcessor orderProcessor = new OrderProcessor(orderRepository);

        // Processing order
        orderProcessor.processOrder("Laptop, Quantity: 1");
    }
}
