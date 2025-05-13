//------------------------------------------------------
// Lab 9
// Written by: Helwa Salameh [1961163]
// For SE 350 Section 630 – Spring 2025
//--------------------------------------------------------

package org.example.Solid.OpenClosed.Example1.Solution;

public class EventHandler {
    private final Vehicle vehicle;

    public EventHandler(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void changeDrivingMode(DrivingMode mode) {
        vehicle.setPower(mode.getPower());
        vehicle.setSuspensionHeight(mode.getSuspensionHeight());
    }
}

