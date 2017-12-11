package com.lesson1.lesson11.printable;

public class Book implements Printable {
    public void print() {
        System.out.println("typing book");
    }

    public static void printBook(Printable[] book) {
        System.out.println("printBook");
        for (Printable p : book) {
            if (p instanceof Book) {
                System.out.println(p);
            }
        }
    }
}
