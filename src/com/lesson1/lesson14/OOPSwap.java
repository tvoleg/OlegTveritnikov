package com.lesson1.lesson14;

public class OOPSwap {
    private static String swap(String s) {
        String s1 = s;
        int i = s.toLowerCase().indexOf("object-oriented programming");
        if (i >= 0) {
            s1 = s.substring(0, i) + "OOP" + s.substring(i + "object-oriented programming".length());
            s1 = swap(s1);
        }
        return s1;
    }

    public static void main(String[] args) {
        String s = "object-oriented programming and OBJECT-ORIENTED PROGRAMMING AND Object-ORIENTED programming";
        System.out.println(swap(s));
    }
}
