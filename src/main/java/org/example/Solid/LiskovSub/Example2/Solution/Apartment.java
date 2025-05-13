//------------------------------------------------------
// Lab 9
// Written by: Helwa Salameh [1961163]
// For SE 350 Section 630 – Spring 2025
//--------------------------------------------------------

package org.example.Solid.LiskovSub.Example2.Solution;

public abstract class Apartment {
    public int squareFootage;
    public int numberOfBedrooms;

    public abstract void setSquareFootage(int sqft);
    public abstract void upgrade();
}
