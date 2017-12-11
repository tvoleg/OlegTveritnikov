package com.lesson1.lesson11.forCheckAccess;

public class ForCheckAccess {
    int a;
    public int b;
    private int c;
    protected int d;


    private void test() {
        a = 1;
        b = 2;
        c = 3;
        d = 4;
    }

    void test2() {
        a = 5;
        b = 6;
        c = 7;
        d = 8;
    }

    protected void test3() {
        test();
        test2();
    }

    public void name4() {
        test();
        test2();
        test3();
    }
}
