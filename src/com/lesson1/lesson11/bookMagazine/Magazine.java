package com.lesson1.lesson11.bookMagazine;

public class Magazine implements Printable {
    public static void main(String[] args) {
        Printable mag[] = new Printable[2];
        mag[0] = new Book();
        mag[1] = new Magazine();
        for (Printable p : mag) {
            p.print();
            p.printBook();
        }
        printMagazine(mag);
    }

    @Override
    public void print() {
        System.out.println("typing magazine");
    }

    @Override
    public void printBook() {
        System.out.println();

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