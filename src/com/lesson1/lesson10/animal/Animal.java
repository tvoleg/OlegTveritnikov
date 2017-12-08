package com.lesson1.lesson10.animal;

abstract public class Animal {
    private String food, location;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    abstract public String makeNoise ();
    abstract public String eat ();

    public static void sleep(){
        System.out.println("Sleeping...");
    }

}
