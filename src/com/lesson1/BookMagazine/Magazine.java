package com.lesson1.BookMagazine;

public class Magazine implements Printable {
    public static void main(String[] args) {
        Printable mag[] = new Printable[2];
        mag[0] = new Book();
        mag[1] = new Magazine();
        for (Printable p : mag) {
            p.print();
        }
        printMagazine(mag);
    }

    @Override
    public void print() {
        System.out.println("typing magazine");
    }

    public static void printMagazine(Printable[] mag) {
        System.out.println("printMag");
        for (Printable p : mag) {
            if (p instanceof Magazine) {
                System.out.println(p);
            }
        }
    }

    @Override
    public String toString() {
        return "Magazine Time";
    }
}