package com.company;

import java.util.Scanner;

public class ChetnoeChislo {

    public static void oddNumder () {
        System.out.println("Введите нечетное число");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            if (scanner.nextInt() % 2 == 1) {
                System.out.println("Ваше число нечетное!");
            } else {
                System.out.println("Введенное число неверное!");
            }
        } else System.out.println("Введенное число неверное!");
    }
}