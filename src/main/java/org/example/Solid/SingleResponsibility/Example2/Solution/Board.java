//------------------------------------------------------
// Lab 9
// Written by: Helwa Salameh [1961163]
// For SE 350 Section 630 – Spring 2025
//--------------------------------------------------------

package org.example.Solid.SingleResponsibility.Example2.Solution;

import java.util.ArrayList;

public class Board {
    private final ArrayList<String> spots;

    public Board() {
        this.spots = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            this.spots.add(String.valueOf(i));
        }
    }

    public ArrayList<String> getSpots() {
        return spots;
    }

    public ArrayList<String> firstRow() {
        return new ArrayList<>(spots.subList(0, 3));
    }

    public ArrayList<String> secondRow() {
        return new ArrayList<>(spots.subList(3, 6));
    }

    public ArrayList<String> thirdRow() {
        return new ArrayList<>(spots.subList(6, 9));
    }
}
