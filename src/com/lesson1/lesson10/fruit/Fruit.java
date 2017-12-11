package com.lesson1.lesson10.fruit;

abstract public class Fruit {
    private double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    static void printManufacturerInfo() {
        System.out.print("Made in Ukraine");
    }

    abstract public double getCost();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fruit fruit = (Fruit) o;

        return Double.compare(fruit.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(weight);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Fruit fruit = new Apple(0.5);
        Fruit fruit1 = new Apple(0.8);
        Fruit fruit2 = new Apple(1.45);
        Fruit fruit3 = new Pear(10.2);
        Fruit fruit4 = new Pear(0.4);
        Fruit fruit5 = new Apricot(3.3);
        double applePrice = fruit.getCost() + fruit1.getCost() + fruit2.getCost();
        double pearPrice = fruit3.getCost() + fruit4.getCost();
        double apricotPrice = fruit5.getCost();
        double allPrice = fruit.getCost() + fruit1.getCost() + fruit3.getCost() + fruit4.getCost() + fruit5.getCost();
        System.out.println("Sum of sold apples = " + applePrice + "\nSum of sold pears = " + pearPrice +
                "\nSum of sold apricots = " + apricotPrice + "\nSum of all sold fruits = " + allPrice);
    }
}
