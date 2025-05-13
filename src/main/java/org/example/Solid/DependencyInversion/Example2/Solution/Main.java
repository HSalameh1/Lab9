//------------------------------------------------------
// Lab 9
// Written by: Helwa Salameh [1961163]
// For SE 350 Section 630 – Spring 2025
//--------------------------------------------------------

package org.example.Solid.DependencyInversion.Example2.Solution;

public class Main {
    public static void main(String[] args) {
        WeatherTracker tracker = new WeatherTracker();
        tracker.addObserver(new Emailer());
        tracker.addObserver(new Phone());

        tracker.setCurrentConditions("rainy");
        tracker.setCurrentConditions("sunny");
    }
}
