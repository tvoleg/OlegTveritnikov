package com.lesson1.lesson7.selectionSorted;

import java.util.Arrays;

public class SelectionSorted {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int k = i;
            int x = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < x) {
                    k = j;
                    x = array[j];
                }
            }
            if (array[k] != array[i]) {
                array[k] = array[i];
                array[i] = x;
            }
        }
    }

    public static void main(String[] args) {
        int[][] data = {
                {2354, 234, 11, 1, 5423, 12, 1, 2, 6, 88},
                {1},
                {0, 3, 2, 1},
                {4, 3, 2, 1, 0},
                {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " => ");
            SelectionSorted.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }

    @Override
    public String toString() {
        return "SelectionSorted{}";
    }
}
