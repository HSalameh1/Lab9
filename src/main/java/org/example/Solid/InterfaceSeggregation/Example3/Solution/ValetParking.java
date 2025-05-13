//------------------------------------------------------
// Lab 9
// Written by: Helwa Salameh [1961163]
// For SE 350 Section 630 – Spring 2025
//--------------------------------------------------------

package org.example.Solid.InterfaceSeggregation.Example3.Solution;

public class ValetParking implements ValetParkable, Chargeable, CapacityAware {
    @Override
    public void valetPark(Car c) {
        System.out.println("Valet parked the car.");
    }

    @Override
    public Car valetUnpark(int ticket) {
        System.out.println("Valet unparked the car.");
        return null;
    }

    @Override
    public double getFee(int ticket) {
        return 25.0;
    }

    @Override
    public void pay(int ticket) {
        System.out.println("Payment received.");
    }

    @Override
    public int getCapacity() {
        return 50;
    }
}
