//------------------------------------------------------
// Lab 9
// Written by: Helwa Salameh [1961163]
// For SE 350 Section 630 – Spring 2025
//--------------------------------------------------------

package org.example.Solid.InterfaceSeggregation.Example2.Solution;

public class Penguin implements SwimmingBird {
    public String currentLocation;
    public int numberOfFeathers;

    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    @Override
    public void swim() {
        this.currentLocation = "in the water";
    }

    @Override
    public void molt() {
        this.numberOfFeathers -= 1;
    }
}