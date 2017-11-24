package com.lesson1.lesson8.matrix;

import java.util.Arrays;

public class Matrix {
    double[][] array;
    int linesRight, linesDown;

    public Matrix(double[][] array) {
        this.linesRight = array.length;
        this.linesDown = array[0].length;
    }

    public Matrix multiplication (double a) {
        double[][] one = new double[this.linesRight][this.linesDown];
        for (int i = 0; i< this.linesRight; i++){
            for (int j = 0;  j< this.linesDown; j++){
                one[i][j] = this.array[i][j] * a;
            }
        }
        return new Matrix(one);
    }
    public void printArray (){
        System.out.println("Lines = " + linesRight);
        System.out.println("Colon = " + linesDown);
        System.out.println(Arrays.deepToString(this.array));
    }


}
