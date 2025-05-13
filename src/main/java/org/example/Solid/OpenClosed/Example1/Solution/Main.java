//------------------------------------------------------
// Lab 9
// Written by: Helwa Salameh [1961163]
// For SE 350 Section 630 – Spring 2025
//--------------------------------------------------------

package org.example.Solid.OpenClosed.Example1.Solution;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        EventHandler handler = new EventHandler(car);

        handler.changeDrivingMode(new SportMode());
        System.out.println("Sport -> Power: " + car.getPower() + ", Suspension: " + car.getSuspensionHeight());

        handler.changeDrivingMode(new ComfortMode());
        System.out.println("Comfort -> Power: " + car.getPower() + ", Suspension: " + car.getSuspensionHeight());
    }
}

