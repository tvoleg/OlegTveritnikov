package com.lesson1.lesson14;

public class OOPSwap {
    private static String swap(String s) {
    return s.replace("object oriented programming", "OOP");
    }
    public static void main(String[] args) {
        String s = "object oriented programming and OBJECT ORIENTED PROGRAMMING AND Object ORIENTED programming";
        System.out.println(swap(s));
    }
}
