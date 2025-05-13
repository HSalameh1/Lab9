//------------------------------------------------------
// Lab 9
// Written by: Helwa Salameh [1961163]
// For SE 350 Section 630 – Spring 2025
//--------------------------------------------------------

package org.example.Solid.InterfaceSeggregation.Example3.Solution;

public class Client {
    public static void main(String[] args) {
        Car myCar = new Car() {}; // dummy car object

        FreeParking freeLot = new FreeParking();
        freeLot.park(myCar);
        freeLot.unpark(1);

        ValetParking valetLot = new ValetParking();
        valetLot.valetPark(myCar);
        valetLot.pay(2);

        StreetParking streetLot = new StreetParking();
        streetLot.park(myCar);
        streetLot.pay(3);
    }
}
