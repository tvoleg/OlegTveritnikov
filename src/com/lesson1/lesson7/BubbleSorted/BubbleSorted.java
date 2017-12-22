package com.lesson1.lesson7.BubbleSorted;

import java.util.Arrays;

public class BubbleSorted {
    public static void sort(int[] array) {
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            for (int j =0; j < array.length - 1 -i; j++) {
                if (array[j] < array[j+1]) {
                    int tmp = array[j];
                    array[j + 1] = array[j+1];
                    check = true;
                }
            }
            if(!check){
                break;
            }
            check = false;
        }
        for (int i = 0; i<array.length; i++){
            System.out.println(array[i]);;
        }
    }

    public static void main(String[] args) {
        int[]data = {1,2,2,3,23,24};
        sort(data);

    }

    @Override
    public String toString() {
        return "BubbleSorted{}";
    }
}