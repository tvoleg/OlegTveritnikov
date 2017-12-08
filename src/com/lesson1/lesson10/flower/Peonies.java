package com.lesson1.lesson10.flower;

public class Peonies extends Flower {
    public Peonies() {
        super("Poland", 15);
    }

    public int costFlower() {
        return 25;
    }

    @Override
    public String toString() {
        return "Peonies: " + super.toString();
    }
}
