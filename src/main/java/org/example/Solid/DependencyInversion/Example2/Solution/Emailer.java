//------------------------------------------------------
// Lab 9
// Written by: Helwa Salameh [1961163]
// For SE 350 Section 630 – Spring 2025
//--------------------------------------------------------

package org.example.Solid.DependencyInversion.Example2.Solution;

public class Emailer implements WeatherObserver {
    @Override
    public void alert(String weatherConditions) {
        System.out.println("EMAIL: It is " + weatherConditions);
    }
}
