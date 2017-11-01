package com.lesson1.DoWhile;

public class DoWhile {
    public static void main (String [] args){
        int a = 0;

        do{
            System.out.println (a% 5 ==0);
            a++;
        }while (a<100);
    }
}
