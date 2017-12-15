package com.lesson1.lesson10.animal;

public class Vet {
    private static void treatAnimal(Animal animal) {
        System.out.println("Location: " + animal.getLocation() + "\nFood: " + animal.getFood());
    }

    @Override
    public String toString() {
        return "Vet{}";
    }

    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        animal[0] = new Cat("Fish", "John's home");
        animal[1] = new Dog("Meat", "Mike's home");
        animal[2] = new Horse("Oats", "Kate's farm");
        for (Animal a : animal) {
            treatAnimal(a);
            a.makeNoise();
            a.sleep();
            a.eat();
        }
    }
}
