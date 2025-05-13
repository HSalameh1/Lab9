//------------------------------------------------------
// Lab 9
// Written by: Helwa Salameh [1961163]
// For SE 350 Section 630 – Spring 2025
//--------------------------------------------------------

package org.example.Solid.InterfaceSeggregation.Example1.Solution;

public class Drone implements EngineSwitch, CameraSwitch {
    private boolean cameraOn;

    @Override
    public void startEngine() {
        System.out.println("Drone engine started.");
    }

    @Override
    public void turnCameraOn() {
        cameraOn = true;
        System.out.println("Drone camera turned on.");
    }

    @Override
    public void turnCameraOff() {
        cameraOn = false;
        System.out.println("Drone camera turned off.");
    }
}
