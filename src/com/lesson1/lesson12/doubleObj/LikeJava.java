package com.lesson1.lesson12.doubleObj;

public class LikeJava {
   public static String a(){
       return "I like Java!!!";
   }
    public static void main(String[] args) {
      //  String a = "I like Java!!!";
        System.out.println(a().charAt(a().length()-1));
        System.out.println(a().endsWith("!!!"));
        System.out.println(a().startsWith("I like"));
    }
}
