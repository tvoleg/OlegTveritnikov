package com.lesson1.lesson2.summa2Chisel;

import java.util.Scanner;

public class Summa2Chisel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers");
        System.out.println(med2(scanner) + med2(scanner));
    }

    private static int med2(Scanner scanner) {
        if (scanner.hasNextInt()) {
            int y = scanner.nextInt();
        } else {
            System.out.println("Вы ввели не правильное число");
            System.exit(0);
        }
        return 0;
    }
}

