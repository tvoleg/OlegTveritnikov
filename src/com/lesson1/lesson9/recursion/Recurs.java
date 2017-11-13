package com.lesson1.lesson9.recursion;

public class Recurs {
    public static void recurExit(int a, int b) {
        if (a != b) {
            System.out.print(a + " ");
            a = runA(a, b);
            recurExit(a, b);
        } else {
            System.out.print(b);
        }
    }

    private static int runA(int a, int b) {
        if (a < b) {
            a++;
        } else {
            a--;
        }
        return a;
    }

    public static void main(String[] args) {
        recurExit(30, 37);
    }
}