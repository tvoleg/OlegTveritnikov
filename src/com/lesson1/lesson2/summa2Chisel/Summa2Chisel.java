package com.lesson1.lesson2.summa2Chisel;

import java.util.Scanner;

public class Summa2Chisel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два целых числа: ");
        if (scanner.hasNextInt()) {
            int y = scanner.nextInt();
            int x = scanner.nextInt();
            System.out.println("Сумма равна: " + (x + y));
        } else {
            System.out.println("Вы ввели не правильное число.");
            System.exit(0);
        }
    }
}

