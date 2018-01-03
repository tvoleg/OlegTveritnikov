package com.lesson1.lesson8.matrix;

import java.util.Arrays;

public class Matrix {
    double[][] array;
    int linesRight, linesDown;

    public Matrix(double[][] array) {
        this.array = array;
        this.linesRight = array.length;
        this.linesDown = array[0].length;
    }

    public Matrix multiplication(double a) {
        double[][] one = new double[this.linesRight][this.linesDown];
        for (int i = 0; i < this.linesRight; i++) {
            for (int j = 0; j < this.linesDown; j++) {
                one[i][j] = this.array[i][j] * a;
            }
        }
        return new Matrix(one);
    }

    public void printArray() {
        System.out.println("Lines = " + linesRight);
        System.out.println("Colons = " + linesDown);
        System.out.println(Arrays.deepToString(this.array));
    }

    public Matrix amount(Matrix matrix) {
        double[][] one = new double[this.linesRight][this.linesDown];
        for (int i = 0; i < this.linesRight; i++) {
            for (int j = 0; j < this.linesDown; j++) {
                one[i][j] = this.array[i][j] + matrix.array[i][j];
            }
            return new Matrix(one);
        }
        return matrix;
    }

    public static void main(String[] args) {
        double a = 10;
        Matrix matrix1 = new Matrix(new double[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}});
        Matrix matrix2 = new Matrix(new double[][]{{111,222},{333,333},{444,555}});

        System.out.println("matrix1: ");
        matrix1.printArray();
        System.out.println("matrix2: ");
        matrix2.printArray();
        System.out.println("multiplication matrix1: ");
        matrix1.multiplication(a).printArray();
        System.out.println("amount of matrix1 and matrix2: ");
        matrix1.amount(matrix2).printArray();
    }
}
