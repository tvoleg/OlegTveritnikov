package com.lesson1.lesson10.animal;

public class Dog extends Animal{

    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    public String makeNoise() {
        return "woof-woof...";
    }

    @Override
    public String eat() {
        return "like to eat meet";
    }

    @Override
    public String toString() {
        return "Dog{} " + super.toString();
    }
}
