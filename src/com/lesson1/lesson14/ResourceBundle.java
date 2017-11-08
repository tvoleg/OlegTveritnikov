package com.lesson1.lesson14;

public class ResourceBundle {
    public static void main(String[] args) {
        printInfo("", "");

        printInfo("en", "US");
        printInfo("ru", "RU");
    }

    private static void printInfo(String language, String country) {
       // Locale current = new Locale(language, country);
       // ResourceBundle rb = ResourceBundle.getBundle("text", current);
       // for (String key : rb.keySet()) {
        //    String value = rb.getString(key);
        //    value = new String(value.getBytes("ISO-8859-1"), "UTF-8");
        //    System.out.println(value);
        }
      //  System.out.println();
    }
//}
