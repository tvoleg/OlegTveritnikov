package com.lesson1.lesson4.mid;

public class MidValue {
    public static void main(String[] args) {
        int a = 0;
        double i = 0;
        if (args.length > 0) {
                for (String s : args) {
                    i = i + Double.parseDouble(s);
                    a++;
                }
                System.out.println("Среднее значение " + i / a);
        } else {
            System.out.println("Введены не верные цыфры ");
        }
    }
}

