package com.lesson1.lesson20;

public class StringThreadDemo {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("A");
        StringThread thr1 = new StringThread(s);
        StringThread thr2 = new StringThread(s);
        StringThread thr3 = new StringThread(s);

        thr1.start();
        thr2.start();
        thr3.start();
    }
}
