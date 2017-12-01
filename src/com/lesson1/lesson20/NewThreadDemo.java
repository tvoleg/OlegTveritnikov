package com.lesson1.lesson20;

public class NewThreadDemo {
    public static void main(String[] args) {
        NewThread newThread = new NewThread();
        NewThread newThread1 = new NewThread();
        newThread.start();
        newThread1.start();
    }
}
