package com.lesson1.lesson7.BubbleSorted;

import java.util.Arrays;

public class BubbleSorted {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] < array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] data = {
                {34, 123, 1, 55, 5, 3, 18},
                {1, 90, 21, 512},
                {0, 3, 2, 1},
                {4, 3, 2, 1, 0},
                {6, 8, 3, 123, 5, 4, 1, 2, 0, 9,}

        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " => ");
            BubbleSorted.sort(arr);
            System.out.println(Arrays.toString(arr));
        }

    }

    @Override
    public String toString() {
        return "BubbleSorted{}";
    }
}