package com.lesson1.lesson10.fruit;

public class Apricot extends Fruit {
    public Apricot(double weight) {
        super(weight);
    }

    @Override
    public double getCost() {
        return 11 * getWeight();
    }

    @Override
    public String toString() {
        return "Apricot = " + super.toString();
    }
}
