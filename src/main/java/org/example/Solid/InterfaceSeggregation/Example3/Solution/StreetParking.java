//------------------------------------------------------
// Lab 9
// Written by: Helwa Salameh [1961163]
// For SE 350 Section 630 – Spring 2025
//--------------------------------------------------------

package org.example.Solid.InterfaceSeggregation.Example3.Solution;

public class StreetParking implements SelfParkable, Chargeable {
    @Override
    public void park(Car c) {
        System.out.println("Self-parked on street.");
    }

    @Override
    public Car unpark(int ticket) {
        System.out.println("Unparked from street.");
        return null;
    }

    @Override
    public double getFee(int ticket) {
        return 5.0;
    }

    @Override
    public void pay(int ticket) {
        System.out.println("Street parking paid.");
    }
}
