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

    static final void printManufacturerInfo() {
        System.out.print("Made in Ukraine");
    }

    abstract public double getCost();

    private static void sumFruit(Fruit[] fruit) {
        double sum = 0;
        for (Fruit f : fruit) {
            sum = sum + f.getCost();
        }
        System.out.println(sum);
    }

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
        fruit[5] = new Apricot(3.3);
        for (Fruit f : fruit) {
            System.out.println("\nSum of sold fruit's = " + f.getCost());
            f.printManufacturerInfo();
            System.out.println(" ");
        }
        System.out.print("Сумма всех фруктов = ");
        sumFruit(fruit);
    }
}



