package com.lesson1.lesson20.myQueue;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyQueue {
    private Queue<Integer> queue = new ArrayDeque<>();

    public synchronized int get() {
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Integer detail = queue.poll();
        System.out.println("Пoлyчeнo: " + detail);

       // notify();
        return detail;
    }

    public synchronized void put(int n) {
    /*    while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/

        queue.add(n);
        System.out.println("Oтпpaвлeнo: " + n);
        notifyAll();
    }
}

