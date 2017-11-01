package com.lesson1.BookMagazine;

public class Magazine implements Printable {
    public static void main(String[] args) {
        Printable mag[] = new Printable[2];
        mag[0] = new Book() ;
        mag[1] = new Magazine() ;
        for (Printable p:mag){
            p.print();
        }
    }
    @Override
    public void print() {
        System.out.println("typing magazine");
    }
}
