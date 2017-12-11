package com.lesson1.lesson10.animal;


public class Horse extends Animal {
    private String say = "choc-choc";

    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Horse make " + say);
    }

    @Override
    public void eat() {
        setFood("like to eat oats");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Horse horse = (Horse) o;

        return say != null ? say.equals(horse.say) : horse.say == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (say != null ? say.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "say='" + say + '\'' +
                "} " + super.toString();
    }
}
