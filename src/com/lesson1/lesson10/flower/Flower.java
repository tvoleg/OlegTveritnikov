package com.lesson1.lesson10.flower;

abstract public class Flower {
    private String manufacturerCountry;
    private int shelfLife;
    private static int count;

    public static int getCount() {
        return count;
    }

    public Flower(String manufacturerCountry, int shelfLife) {
        this.manufacturerCountry = manufacturerCountry;
        this.shelfLife = shelfLife;
        count++;
    }

    abstract public int costFlower();

    public static int sumSoldBouquets(Flower[] bouquet) {
        int sum = 0;
        for (Flower f : bouquet) {
           sum = f.costFlower() + sum;
        }
      return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;

        if (shelfLife != flower.shelfLife) return false;
        return manufacturerCountry != null ? manufacturerCountry.equals(flower.manufacturerCountry) : flower.manufacturerCountry == null;
    }

    @Override
    public int hashCode() {
        int result = manufacturerCountry != null ? manufacturerCountry.hashCode() : 0;
        result = 31 * result + shelfLife;
        return result;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "manufacturerCountry='" + manufacturerCountry + '\'' +
                ", shelfLife=" + shelfLife +
                '}';
    }

    public static void main(String[] args) {
        Flower[] bouquet1 = new Flower[7];
        bouquet1[0] = new Rose();
        bouquet1[1] = new Tulips();
        bouquet1[2] = new Tulips();
        bouquet1[3] = new Carnations();
        bouquet1[4] = new Peonies();
        bouquet1[5] = new Peonies();
        bouquet1[6] = new Peonies();
        System.out.println("Price of the first bouquet = " + sumSoldBouquets(bouquet1));

        Flower[] bouquet2 = new Flower[4];
        bouquet2[0] = new Rose();
        bouquet2[1] = new Tulips();
        bouquet2[2] = new Carnations();
        bouquet2[3] = new Peonies();
        System.out.println("Price of the second bouquet = " + sumSoldBouquets(bouquet2));

        Flower[] bouquet3 = new Flower[6];
        bouquet3[0] = new Tulips();
        bouquet3[1] = new Tulips();
        bouquet3[2] = new Peonies();
        bouquet3[3] = new Peonies();
        bouquet3[4] = new Rose();
        bouquet3[5] = new Carnations();
        System.out.println("Price of the third bouquet = " + sumSoldBouquets(bouquet3));

        int price = sumSoldBouquets(bouquet1) + sumSoldBouquets(bouquet2) + sumSoldBouquets(bouquet3);
        System.out.println("Number of sold flowers = " + (bouquet1.length + bouquet2.length + bouquet3.length) +
                "\nPrice for 3 bouquets =" + price);
    }
}
