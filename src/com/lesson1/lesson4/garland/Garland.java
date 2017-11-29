package com.lesson1.lesson4.garland;

public class Garland {
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
        int garland = 78954234;
        System.out.println("Заедйствуем гирлянду: ");
        printState(garland);
        System.out.println("Проверка, включена ли первая лампочка: " + (firstLight(garland) ? "Включена" : "Выключена"));
        System.out.println("Лампочка мигает заданное количество раз: ");
        blinkLamps(9, garland);
        System.out.println("Режим бегущей строки: ");
        runLine();
    }
}
