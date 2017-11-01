package com.lesson1.FactorialProj;

public class Factorial {
    public static double getRand(int n) {
        return Math.random() * n;
    }

    public static void main(String[] args) {
        long n = (long) (Math.random() * 100);
        int a = 1;
        for (int i = 1; i < n; i++) {
            a = a * i;
        }
        System.out.println(n + "! = " + a);
    }
}

