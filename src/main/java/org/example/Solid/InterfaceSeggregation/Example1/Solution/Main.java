//------------------------------------------------------
// Lab 9
// Written by: Helwa Salameh [1961163]
// For SE 350 Section 630 – Spring 2025
//--------------------------------------------------------

package org.example.Solid.InterfaceSeggregation.Example1.Solution;

public class Main {
    public static void main(String[] args) {
        Drone drone = new Drone();
        drone.startEngine();
        drone.turnCameraOn();
        drone.turnCameraOff();

        Car car = new Car();
        car.startEngine();
        car.turnRadioOn();
        car.turnRadioOff();
    }
}
