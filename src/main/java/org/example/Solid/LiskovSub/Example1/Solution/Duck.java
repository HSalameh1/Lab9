//------------------------------------------------------
// Lab 9
// Written by: Helwa Salameh [1961163]
// For SE 350 Section 630 – Spring 2025
//--------------------------------------------------------

package org.example.Solid.LiskovSub.Example1.Solution;

public class Duck extends Bird implements FlyingBird {
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
}
