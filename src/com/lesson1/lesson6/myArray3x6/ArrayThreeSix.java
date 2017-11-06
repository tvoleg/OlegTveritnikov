package com.lesson1.lesson6.myArray3x6;

public class ArrayThreeSix {
    public static void main(String[] args) {
        char c = 'a';
        String[][] array = new String[3][6];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = c + "" + (j + 1);
            }
            c++;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
