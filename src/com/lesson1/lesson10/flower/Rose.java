package com.lesson1.lesson10.flower;

public class Rose extends Flower {

    public Rose() {super("French", 9);}

    public int costFlower() {
        return 40;
    }

    @Override
    public String toString() {
        return "Rose: " + super.toString();
    }
}
