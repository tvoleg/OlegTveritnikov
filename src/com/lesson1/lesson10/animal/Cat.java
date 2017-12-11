package com.lesson1.lesson10.animal;


public class Cat extends Animal {
    private String say = "meow";

    public Cat(String food, String location) {
        super(food, location);

    }

    public void makeNoise() {
        System.out.println("Cat says " + say);
    }


    public void eat() {
        setFood("like to eat fish");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cat cat = (Cat) o;

        return say != null ? say.equals(cat.say) : cat.say == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (say != null ? say.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "say='" + say + '\'' +
                "} " + super.toString();
    }
}