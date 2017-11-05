package com.lesson1.LowModule;


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
