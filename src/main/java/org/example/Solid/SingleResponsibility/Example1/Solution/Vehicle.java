//------------------------------------------------------
// Lab 9
// Written by: Helwa Salameh [1961163]
// For SE 350 Section 630 – Spring 2025
//--------------------------------------------------------

package org.example.Solid.SingleResponsibility.Example1.Solution;

class Vehicle {
    private final FuelSystem fuelSystem;

    public Vehicle(final int maxFuel) {
        this.fuelSystem = new FuelSystem(maxFuel);
    }

    public void accelerate() {
        fuelSystem.consumeFuel(1);
    }

    public FuelSystem getFuelSystem() {
        return fuelSystem;
    }

    public static class Main {
        public static void main(String[] args) {
            Vehicle car = new Vehicle(100);

            // Accelerate the vehicle
            car.accelerate();

            // Check fuel
            System.out.println("Remaining fuel: " + car.getFuelSystem().getRemainingFuel());

            // Refuel when needed
            car.getFuelSystem().reFuel();
        }
    }
}