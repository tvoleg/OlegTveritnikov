package com.company;

import java.util.Scanner;

public class TheDays {
    public static void dayWeek() {
        System.out.println("Введите номер дня");
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextInt()) {
            int day = scn.nextInt();
            if (day == 1) {
                System.out.println("Понедельник");
            } else if (day == 2) {
                System.out.println("Вторник");
            } else if (day == 3) {
                System.out.println("Среда");
            } else if (day == 4) {
                System.out.println("Четверг");
            } else if (day == 5) {
                System.out.println("Пятница");
            } else if (day == 6) {
                System.out.println("Выходной");
            } else if (day == 7) {
                System.out.println("Выходной");
            }
        } else {
            System.out.println("Отпуск");
        }
    }
}