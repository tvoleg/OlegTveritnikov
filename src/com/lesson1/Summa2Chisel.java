package com.company;

import java.util.Scanner;

public class Summa2Chisel {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int sum;
        System.out.println("Enter two integers");
        if (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            if (scanner.hasNextInt()) {
                int y = scanner.nextInt();
                sum = (x + y);
                System.out.println("Сумма равна = " + sum);
            }
        } else {
            System.out.println("Вы ввели не правильное число");
        }
    }
}

