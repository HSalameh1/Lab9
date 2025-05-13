//------------------------------------------------------
// Lab 9
// Written by: Helwa Salameh [1961163]
// For SE 350 Section 630 – Spring 2025
//--------------------------------------------------------

package org.example.Solid.InterfaceSeggregation.Example2.Solution;

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle(100);
        eagle.fly();
        eagle.molt();
        System.out.println("Eagle is " + eagle.currentLocation + " with " + eagle.numberOfFeathers + " feathers.");

        Penguin penguin = new Penguin(80);
        penguin.swim();
        penguin.molt();
        System.out.println("Penguin is " + penguin.currentLocation + " with " + penguin.numberOfFeathers + " feathers.");
    }
}
