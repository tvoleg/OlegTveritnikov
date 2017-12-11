package com.lesson1.lesson10.animal;


public class Dog extends Animal {
    private String say = "woof-woof";

    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {

        System.out.println( "Dog says " + say);
    }

    @Override
    public void eat() {
        setFood( "like to eat meet");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Dog dog = (Dog) o;

        return say != null ? say.equals(dog.say) : dog.say == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (say != null ? say.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "say='" + say + '\'' +
                "} " + super.toString();
    }
}