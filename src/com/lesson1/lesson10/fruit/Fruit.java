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

    public final void printManufacturerInfo() {
        System.out.print("Made in Ukraine");
    }

    public static double sumFruits(Fruit[] fruits) {
        double sum = 0;
        for (Fruit f : fruits) {
            sum = f.getCost() + sum;
        }
        return sum;
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
        return "Fruit weight = " + weight + ";";
    }

    public static void main(String[] args) {
        Fruit[] fruit = new Fruit[6];
        fruit[0] = new Apple(0.8);
        fruit[1] = new Apple(1.45);
        fruit[2] = new Pear(10.2);
        fruit[3] = new Pear(0.4);
        fruit[4] = new Apricot(3.3);
        for (Fruit f : fruit) {
            System.out.println("\nSum of sold fruit's = " + f.getCost());
            f.printManufacturerInfo();
        }
        Fruit.sumFruits(fruit);
    }
}



