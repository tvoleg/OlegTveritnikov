package com.lesson1.lesson20.myQueue;

public class Producer implements Runnable {
    MyQueue myQueue;

    public Producer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            myQueue.put(i);
        }
    }
}

