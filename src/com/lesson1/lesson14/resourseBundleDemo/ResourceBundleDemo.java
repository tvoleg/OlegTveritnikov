package com.lesson1.lesson14.resourseBundleDemo;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        printInfo("", "");
        printInfo("en", "US");
        printInfo("ru", "RU");
    }

    private static void printInfo(String language, String country) throws UnsupportedEncodingException {
       Locale current = new Locale(language, country);
       ResourceBundle rb = ResourceBundle.getBundle("com.lesson1.lesson14.base", current);
        String s1 = rb.getString("str1");
        s1 = new String(s1.getBytes("ISO-8859-1"), "UTF-8");
        String s2 = rb.getString("str2");
        s2 = new String(s2.getBytes("ISO-8859-1"), "UTF-8");
        String s3 = rb.getString("str3");
        s3 = new String(s3.getBytes("ISO-8859-1"), "UTF-8");
        String s4 = rb.getString("str4");
        s4 = new String(s4.getBytes("ISO-8859-1"), "UTF-8");
        System.out.println(s1 + "\n" + s2 + "\n" + s3 + "\n" + s4);
    }
}
