package com.lesson1.lesson14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findJava {
    public static void main(String[] args) {
        String regex = "Java\\s*\\d";
        String a = "Versions: Java5, Java 6, Java  7, Java   8";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(a);
        while (matcher.find()){
            System.out.println("Version: " + matcher.group());
        }
    }
}
