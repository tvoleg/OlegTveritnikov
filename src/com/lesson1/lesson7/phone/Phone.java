package com.lesson1.lesson7.phone;

public class Phone {
    int number;
    String model;
    int weight;

    private static int count = 0;
    private String end = "none";

    public Phone(String end) {
        this.end = end;
        count++;
    }

    public static int getCount() {
        return count;
    }
    public void setCount (int count) {this.count = count;}

    void receiveCall(String name) {
        System.out.println(name + "calling");
    }

    void receiveCall(String name, String number) {
        System.out.println(name + number);
    }

    int getPhoneNumber() {
        return number;
    }

    Phone() {
        System.out.println("basic");
    }

    Phone(int n, String m, int w) {
        this();
        number = n;
        model = "m";
        weight = w;
    }

    void sendMassage(int... array) {
        System.out.println("Номер получателя:" + array.length);
        for (int number : array) {
            System.out.println(number);
        }
        System.out.println();
    }

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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    protected void finalize() {
        System.out.println("Sum");
        count--;
    }
}

