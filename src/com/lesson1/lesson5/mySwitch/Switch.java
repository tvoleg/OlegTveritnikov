package com.lesson1.lesson5.mySwitch;

import java.util.Scanner;

public class Switch {
    public static void main (String [] args) {
        System.out.println("Введите номер дня");
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextInt()) {
            int day = scn.nextInt();
            String dayWeek;

            switch (day) {
                case 1:
                    dayWeek = "Понедельник";
                    break;
                case 2:
                    dayWeek = "Вторник";
                    break;
                case 3:
                    dayWeek = "Среда";
                    break;
                case 4:
                    dayWeek = "Четверг";
                    break;
                case 5:
                    dayWeek = "Пятница";
                    break;
                case 6:
                case 7:
                    dayWeek = "Выходной";
                    break;

                default:
                    dayWeek = "Число меньше 1 или больше 7";
            }
            System.out.println("Сегодня " + dayWeek + ".");
        }
    }
}
