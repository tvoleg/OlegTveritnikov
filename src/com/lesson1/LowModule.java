package com.company;


import java.util.Scanner;

public class LowModule {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a=0, b=0, c=0;

        System.out.println("Введите три числа");
        if (scn.hasNextInt()) {
            a = (scn.nextInt() % 2 < b ? a : c);
            System.out.println(a);
        } else {
        }
    }
}