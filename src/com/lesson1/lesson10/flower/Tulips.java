package com.lesson1.lesson10.flower;

public class Tulips extends Flower {

    public Tulips() {
        super("Holland", 11);
    }

    public int costFlower() {
        return 30;
    }

    @Override
    public String toString() {
        return "Tulips: " + super.toString();
    }
}
