package com.lesson1.lesson20;

public class NewRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println(i + " " + Thread.currentThread().getName());
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        NewRunnable newRunnableDemo = new NewRunnable();
        Thread thread = new Thread(newRunnableDemo);
        Thread thread2 = new Thread(newRunnableDemo);
        Thread thread3 = new Thread(newRunnableDemo);

        thread.start();
        thread2.start();
        thread3.start();
    }
}
