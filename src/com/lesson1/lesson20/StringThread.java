package com.lesson1.lesson20;

public class StringThread extends Thread {
    private StringBuilder str;

    public StringThread(StringBuilder str) {
        this.str = str;
    }

    @Override
    public void run() {
        synchronized (str) {
            for (int i = 0; i < 100; i++) {
                System.out.print(str);
            }
            System.out.println(" " + Thread.currentThread().getName());
            char c = str.charAt(0);
            str.setCharAt(0, ++c);
        }
    }
}
