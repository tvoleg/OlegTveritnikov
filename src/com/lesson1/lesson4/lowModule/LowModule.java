package com.lesson1.lesson4.lowModule;


import java.util.Scanner;

public class LowModule {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        double a, b, c;
        System.out.print("Введите три целые числа ");
        a = getDbl(entry);
        b = getDbl(entry);
        c = getDbl(entry);

        a = a < 0 ? -a : a;
        b = b < 0 ? -b : b;
        c = c < 0 ? -c : c;

        if (a < b && a < c) {
            System.out.println("Наименьшее по модулю число = " + a);
        } else if (b < a && b < c) {
            System.out.println("Наименьшее по модулю число = " + b);
        } else {
            System.out.println("Наименьшее по модулю число = " + c);
        }
    }

    public static double getDbl(Scanner entry) {
        if (entry.hasNextDouble()) {
            return entry.nextDouble();
        }
        System.out.println("Введенные числа не правильные");
        System.exit(0);
        return 0;
    }
}
