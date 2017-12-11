package com.lesson1.lesson7.searchMaxMinValue;

import java.util.Arrays;

public class SearchMaxMinValueArray {
    public static int minValue (int [] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
    public static int maxValue (int [] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    @Override
    public String toString() {
        return "SearchMaxMinValueArray{}";
    }

    public static void main(String[] args) {
        int [][] arr = {{3,4,31,4,56,66,3,1}, {343,234,33,11,3,1,2,9},
                {4,45,345,111,3,1,23,4}, {234,3,77,64,23,18,4,1},{344,35,345,67,12,29,53,66}};
        int [][]arr2 = new int[5][2];
        int i = 0;
        System.out.println("Первоначальный массив:");
        for (int [] maxMinArray : arr){
            System.out.println(Arrays.toString(maxMinArray));
            arr2 [i][0] = minValue(maxMinArray);
            arr2 [i][1] = maxValue(maxMinArray);
            i++;

    }
        System.out.println("Массив максимальных и минимальных значений седующий:\n" + Arrays.deepToString(arr2));
    }

}
