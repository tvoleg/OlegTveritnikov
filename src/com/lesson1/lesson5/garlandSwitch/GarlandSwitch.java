package com.lesson1.lesson5.garlandSwitch;

import java.util.Scanner;

public class GarlandSwitch {
    public static void blinkLamps(int count, int a) {
        int b = a;
        for (int i = 0; i < count; i++) {
            b = ~b;
            printState(b);
        }
    }

    public static void printState(int i) {
        String s = Integer.toBinaryString(i);
        int c = 32 - s.length();
        for (int j = 0; j < c; j++) {
            System.out.print("0");
        }
        System.out.println(s);
    }

    public static void runLine() {
        int l = 1;
        for (int i = 1; i <= 32; i++) {
            printState(l);
            l = l << 1;
        }
    }

    public static boolean firstLight(int a) {
        return (a & 1) != 0;
    }

    public static void main(String[] args) {
        int garland = 15151515;
        Scanner scn = new Scanner(System.in);
        int a;
        System.out.println("Используемая гирлянда: " + garland);
        System.out.println("Выберите режим: ");
        System.out.println("  1 - Байтовое представление гиралянды;");
        System.out.println("  2 - Проверка, включена ли первая лампочка;");
        System.out.println("  3 - Мигание лампочки заданное количество раз;");
        System.out.println("  4 - Режим бегущей строки.");
        System.out.print("Введите число: ");
        if (scn.hasNextInt()) {
            a = scn.nextInt();
            if (a < 1 || a > 4) {
                System.out.println("Выбираемого режима не существует.");
            } else {
                switch (a) {
                    case 1:
                        System.out.println("Выбран режим бегущей строки: ");
                        printState(garland);
                        break;
                    case 2:
                        System.out.println("Выбран режим проверки, включена ли первая лампочка: ");
                        System.out.println((firstLight(garland) ? "Включена" : "Выключена"));
                        break;
                    case 3:
                        System.out.println("Выбран режим мигание на определенное количество раз: ");
                        blinkLamps(7, garland);
                        break;
                    case 4:
                        System.out.println("Выбран режим бегущей строки: ");
                        runLine();
                        break;
                    default:
                        System.out.println("default");
                }
            }
        }
    }
}