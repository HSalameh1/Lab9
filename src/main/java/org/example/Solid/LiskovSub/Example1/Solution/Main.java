//------------------------------------------------------
// Lab 9
// Written by: Helwa Salameh [1961163]
// For SE 350 Section 630 – Spring 2025
//--------------------------------------------------------

package org.example.Solid.LiskovSub.Example1.Solution;

public class Main {
    public static void main(String[] args) {
        Bird duck = new Duck();
        Bird ostrich = new Ostrich();

        duck.eat();       // OK
        ostrich.eat();    // OK

        if (duck instanceof FlyingBird) {
            ((FlyingBird) duck).fly();  // Duck is flying
        }

        if (ostrich instanceof FlyingBird) {
            ((FlyingBird) ostrich).fly();  // Won’t run — safe
        } else {
            System.out.println("Ostrich can't fly");
        }
    }
}
