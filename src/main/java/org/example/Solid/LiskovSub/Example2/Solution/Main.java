//------------------------------------------------------
// Lab 9
// Written by: Helwa Salameh [1961163]
// For SE 350 Section 630 – Spring 2025
//--------------------------------------------------------

package org.example.Solid.LiskovSub.Example2.Solution;

public class Main {
    public static void main(String[] args) {
        Apartment studio = new Studio();
        Apartment penthouse = new PenthouseSuite();

        studio.setSquareFootage(300);
        penthouse.setSquareFootage(1000);

        UnitUpgrader upgrader = new UnitUpgrader();
        upgrader.upgrade(studio);
        upgrader.upgrade(penthouse);

        System.out.println("Studio: " + studio.squareFootage + " sqft, " + studio.numberOfBedrooms + " bedrooms");
        System.out.println("Penthouse: " + penthouse.squareFootage + " sqft, " + penthouse.numberOfBedrooms + " bedrooms");
    }
}
