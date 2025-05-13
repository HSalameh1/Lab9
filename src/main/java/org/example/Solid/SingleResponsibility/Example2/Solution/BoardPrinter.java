//------------------------------------------------------
// Lab 9
// Written by: Helwa Salameh [1961163]
// For SE 350 Section 630 – Spring 2025
//--------------------------------------------------------

package org.example.Solid.SingleResponsibility.Example2.Solution;

public class BoardPrinter {
    public static void display(Board board) {
        var s = board.getSpots();
        System.out.println(
                s.get(0) + " | " + s.get(1) + " | " + s.get(2) + "\n" +
                        s.get(3) + " | " + s.get(4) + " | " + s.get(5) + "\n" +
                        s.get(6) + " | " + s.get(7) + " | " + s.get(8)
        );
    }
}

