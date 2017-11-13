package com.lesson1.lesson12.likeJava;

public class LikeJava {
   public static String a(){
       return "I like Java!!!";
   }
    public static void main(String[] args) {
        System.out.println(a().charAt(a().length()-1));
        System.out.println(a().endsWith("!!!"));
        System.out.println(a().startsWith("I like"));

        System.out.println(a().replace('a','o'));
        System.out.println(a().toLowerCase());
        System.out.println(a().toUpperCase());
        System.out.println(a().substring(7,11));
    }
}
