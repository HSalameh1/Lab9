//------------------------------------------------------
// Lab 9
// Written by: Helwa Salameh [1961163]
// For SE 350 Section 630 – Spring 2025
//--------------------------------------------------------

package org.example.Solid.DependencyInversion.Example2.Solution;

import java.util.ArrayList;
import java.util.List;

public class WeatherTracker {
    private final List<WeatherObserver> observers = new ArrayList<>();

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void setCurrentConditions(String weatherDescription) {
        for (WeatherObserver observer : observers) {
            observer.alert(weatherDescription);
        }
    }
}
