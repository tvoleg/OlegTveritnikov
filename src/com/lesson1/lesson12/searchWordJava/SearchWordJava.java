package com.lesson1.lesson12.searchWordJava;

public class SearchWordJava {
    public static void test(String str) {
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));

        System.out.println(str.replace('a', 'o'));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.substring(7, 11));
    }

    public static void main(String[] args) {
        test("I like Java!!!");
        test("I don't like java");
    }
}
