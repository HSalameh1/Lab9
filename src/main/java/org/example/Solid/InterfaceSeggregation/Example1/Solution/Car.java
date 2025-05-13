//------------------------------------------------------
// Lab 9
// Written by: Helwa Salameh [1961163]
// For SE 350 Section 630 – Spring 2025
//--------------------------------------------------------

package org.example.Solid.InterfaceSeggregation.Example1.Solution;

public class Car implements EngineSwitch, RadioSwitch {
    private boolean radioOn;

    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    public void turnRadioOn() {
        radioOn = true;
        System.out.println("Car radio turned on.");
    }

    @Override
    public void turnRadioOff() {
        radioOn = false;
        System.out.println("Car radio turned off.");
    }
}
