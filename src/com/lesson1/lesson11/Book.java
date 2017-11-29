package com.lesson1.lesson11;

public class Book implements Printable {
    public void print() {
        System.out.println("typing book");
    }


    public void printBook() {

    }

    public static void main(String[] args) {
        Book book = new Book();
        book.printBook();
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
