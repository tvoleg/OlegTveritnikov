package com.lesson1.lesson13;

public class ReturnTwoChar {
    public static String chars(String s) {
        int a = s.length() / 2;
        return s.substring(a - 1, a + 1);
    }

    public static void main(String[] args) {
        System.out.println(chars("Say no more"));
        System.out.println(chars("check"));
        System.out.println(chars("Hello World"));
        System.out.println(chars("terrible"));
    }
}
