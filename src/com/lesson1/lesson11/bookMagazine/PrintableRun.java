package com.lesson1.lesson11.bookMagazine;

public class PrintableRun {
    public static void main(String[] args) {
        Printable p = new Printable() {
            @Override
            public void print() {
                System.out.println("Time");
            }
        };
        p.print();
    }
}
