//------------------------------------------------------
// Lab 9
// Written by: Helwa Salameh [1961163]
// For SE 350 Section 630 – Spring 2025
//--------------------------------------------------------

package org.example.Solid.SingleResponsibility.Example1.Solution;

class FuelSystem {
    private final int maxFuel;
    private int remainingFuel;

    public FuelSystem(final int maxFuel) {
        this.maxFuel = maxFuel;
        this.remainingFuel = maxFuel;
    }

    public void reFuel() {
        remainingFuel = maxFuel;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }

    public void setRemainingFuel(final int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }

    public void consumeFuel(int amount) {
        remainingFuel -= amount;
    }
}