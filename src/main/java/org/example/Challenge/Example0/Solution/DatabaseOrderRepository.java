//------------------------------------------------------
// Lab 9
// Written by: Helwa Salameh [1961163]
// For SE 350 Section 630 – Spring 2025
//--------------------------------------------------------

package org.example.Challenge.Example0.Solution;

public class DatabaseOrderRepository implements OrderRepository {
    @Override
    public void saveOrder(String orderDetails) {
        System.out.println("Saving to real database: " + orderDetails);
    }
}
