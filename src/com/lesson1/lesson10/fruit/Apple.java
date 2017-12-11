package com.lesson1.lesson10.fruit;

public class Apple extends Fruit {

    public Apple(double weight) {
        super(weight);
    }

    @Override
    public double getCost() {
        return 16 * getWeight();
    }

    @Override
    public String toString() {
        return "Apple{} " + super.toString();
    }
}
