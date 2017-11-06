package com.lesson1.lesson2.chetNechet;

import java.util.Scanner;

class ChetNechet {

    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextInt()) {
            method2(scn);
        } else System.out.println("Ошибка. Вы ввели не целое число");
    }

    private static void method2(Scanner scn) {
        if (scn.nextInt() % 2 == 0) {
            System.out.println("Число четное!");
        } else {
            System.out.println("Число не четное!");
        }
    }
}