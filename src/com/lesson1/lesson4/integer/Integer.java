package com.lesson1.lesson4.integer;

import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Веедите целое число");
        if (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            if (0 < x && x < 10) {
                System.out.println("Положительное число меньше 10");
            } else {
                System.out.println("Положительное число больше 10 или отрицательное");
            }
        }
    }
}

