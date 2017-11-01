package com.lesson1.Summa2Chisel;

import java.util.Scanner;

public class Summa2Chisel {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers");
        if (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            med2(scanner, x);
        } else {
            System.out.println("Вы ввели не правильное число");
        }
    }

    private static void med2(Scanner scanner, int x) {
        int sum;
        if (scanner.hasNextInt()) {
            int y = scanner.nextInt();
            sum = (x + y);
            System.out.println("Сумма равна = " + sum);
        }
    }
}

