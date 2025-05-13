//------------------------------------------------------
// Lab 9
// Written by: Helwa Salameh [1961163]
// For SE 350 Section 630 – Spring 2025
//--------------------------------------------------------

package org.example.Solid.InterfaceSeggregation.Example3.Solution;

public class FreeParking implements SelfParkable {
    @Override
    public void park(Car c) {
        System.out.println("Car parked freely.");
    }

    @Override
    public Car unpark(int ticket) {
        System.out.println("Car unparked.");
        return null;
    }
}
