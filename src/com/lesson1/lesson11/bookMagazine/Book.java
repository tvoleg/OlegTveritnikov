package com.lesson1.lesson11.bookMagazine;

public class Book implements Printable {
    public void print() {
        System.out.println("typing book");
    }

    public static void printBook(Printable[] mag) {
        System.out.println("printBook");
        for (Printable p : mag) {
            if (p instanceof Book) {
                System.out.println(p);
            }
        }
    }
}
