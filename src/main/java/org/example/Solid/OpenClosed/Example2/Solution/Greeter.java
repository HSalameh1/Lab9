//------------------------------------------------------
// Lab 9
// Written by: Helwa Salameh [1961163]
// For SE 350 Section 630 – Spring 2025
//--------------------------------------------------------

package org.example.Solid.OpenClosed.Example2.Solution;

public class Greeter {
    private GreetingStrategy strategy;

    public Greeter(GreetingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setGreetingStrategy(GreetingStrategy strategy) {
        this.strategy = strategy;
    }

    public String greet() {
        return strategy.greet();
    }
}
