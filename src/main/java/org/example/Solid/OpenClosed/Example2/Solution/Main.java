//------------------------------------------------------
// Lab 9
// Written by: Helwa Salameh [1961163]
// For SE 350 Section 630 – Spring 2025
//--------------------------------------------------------

package org.example.Solid.OpenClosed.Example2.Solution;

public class Main {
    public static void main(String[] args) {
        Greeter greeter = new Greeter(new DefaultGreeting());
        System.out.println(greeter.greet());

        greeter.setGreetingStrategy(new FormalGreeting());
        System.out.println(greeter.greet());

        greeter.setGreetingStrategy(new CasualGreeting());
        System.out.println(greeter.greet());

        greeter.setGreetingStrategy(new IntimateGreeting());
        System.out.println(greeter.greet());
    }
}

