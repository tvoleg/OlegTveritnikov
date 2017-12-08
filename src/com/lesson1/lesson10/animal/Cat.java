package com.lesson1.lesson10.animal;

public class Cat extends Animal {
    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public String makeNoise() {
        return "meow-meow";
    }

    @Override
    public String eat() {
        return "like to eat fish";
    }

    @Override
    public String toString() {
        return "Cat{} " + super.toString();
    }
}
