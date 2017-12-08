package com.lesson1.lesson10.animal;

public class Horse extends Animal{
    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    public String makeNoise() {
        return "choc-choc";
    }

    @Override
    public String eat() {
        return "like to eat oats";
    }

}
