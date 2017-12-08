package com.lesson1.lesson10.flower;

public class Carnations extends Flower {
    public Carnations() {
        super("Ukraine", 21);
    }
    public int costFlower(){
        return 10;
    }

    @Override
    public String toString() {
        return "Carnations:  " + super.toString();
    }
}
