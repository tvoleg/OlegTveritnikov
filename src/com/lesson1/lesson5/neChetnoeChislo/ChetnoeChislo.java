package com.lesson1.lesson5.neChetnoeChislo;

        import java.util.Scanner;

public class ChetnoeChislo {

    public static void main(String[] args) {
        System.out.println("Введите нечетное число");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            med2(scanner);
        }

    }

    private static void med2(Scanner scanner) {
        if (scanner.nextInt() % 2 == 1) {
            System.out.println("Ваше число нечетное!");
        } else {
            System.out.println("Введенное число неверное!");
        }
    }
}