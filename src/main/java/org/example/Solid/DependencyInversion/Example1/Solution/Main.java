package org.example.Solid.DependencyInversion.Example1.Solution;

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new RacingCar(100);
        Driver driver = new Driver(myCar);
        driver.increaseSpeed();
    }
}
