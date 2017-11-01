package com.lesson1.DoWhile;

public class DoWhile {
    public static void main (String [] args){
        int a = 1;

        do{
            if (a% 5 ==0) {
                System.out.println(a);
            }
            a++;
        }while (a<100);
    }
}
