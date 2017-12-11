package com.lesson1.lesson10.fruit;

public class Pear extends Fruit {
    public Pear(double weight) {
        super(weight);
    }

    @Override
    public double getCost() {
        return 20 * getWeight();
    }

    @Override
    public String toString() {
        return "Pear{} " + super.toString();
    }
}
