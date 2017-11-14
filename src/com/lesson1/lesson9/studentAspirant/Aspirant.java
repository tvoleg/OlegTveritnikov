package com.lesson1.lesson9.studentAspirant;

public class Aspirant extends Student {
    private String work = "Science";
    String name;
    private int scholar = 200;

    public Aspirant(String w, String name) {
        super(name);
        this.work = w;
    }

    public static void main(String[] args) {
        Student student = new Aspirant();
    }

    Aspirant() {
    }

    public int getSchoolarship() {
        return scholar;
    }
}