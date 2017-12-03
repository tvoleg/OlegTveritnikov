package com.lesson1.lesson2.summa2Chisel;

import java.util.Scanner;

public class Summa2Chisel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два целых числа: ");
        int a = run(scanner);
        int b = run(scanner);
        System.out.println(a + b);
    }

    private static int run(Scanner scanner) {
        if (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            return x;
        } else {
            System.out.println("Вы ввели не правильное число.");
            System.exit(0);
        }
        return 0;
    }
}
