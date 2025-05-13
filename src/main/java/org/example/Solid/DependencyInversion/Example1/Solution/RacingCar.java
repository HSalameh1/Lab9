//------------------------------------------------------
// Lab 9
// Written by: Helwa Salameh [1961163]
// For SE 350 Section 630 – Spring 2025
//--------------------------------------------------------

package org.example.Solid.DependencyInversion.Example1.Solution;

public class RacingCar implements Vehicle {
    private int remainingFuel;
    private int power;

    public RacingCar(final int fuel) {
        this.remainingFuel = fuel;
        this.power = 0;
    }

    @Override
    public void accelerate() {
        power++;
        remainingFuel--;
    }
}
