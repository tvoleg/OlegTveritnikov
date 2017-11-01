package com.company;

public class PhoneMy {
    int number;
    String model;
    int weight;

    void receiveCall(String name) {
        System.out.println(name + "calling");
    }

    void receiveCall(String name, String number) {
        System.out.println(name + number);
    }

    int getPhoneNumber() {
        return number;
    }

    PhoneMy() {
        System.out.println("basic");
    }

    PhoneMy(int n, String m, int w) {
        this();
        number = n;
        model = m;
        weight = w;
    }

    double volume() {
        return number * weight;
    }
    void sendMassage (int...array){
        System.out.println("Номер получателя:" + array.length);
        for (int number : array){
            System.out.println(number);
        }
        System.out.println();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int isWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private static int count = 0;
    private String end = "none";

    public PhoneCount(String end) {
        this.end = end;
        count++;
    }

    static int getCount() {
        return count;
    }

    protected void finalize() {
        System.out.println("Sum");
        count--;
    }
}
