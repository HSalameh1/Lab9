//------------------------------------------------------
// Lab 9
// Written by: Helwa Salameh [1961163]
// For SE 350 Section 630 – Spring 2025
//--------------------------------------------------------

package org.example.Solid.OpenClosed.Example1.Solution;

public class ComfortMode implements DrivingMode {
    @Override
    public int getPower() {
        return 400;
    }

    @Override
    public int getSuspensionHeight() {
        return 20;
    }
}

