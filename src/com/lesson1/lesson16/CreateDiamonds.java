package com.lesson1.lesson16;

import java.io.Serializable;

public class CreateDiamonds<T extends String, V extends Animal & Serializable, K extends Number> {
    T ob1;
    V ob2;
    K ob3;

    CreateDiamonds(T o1, V o2, K o3) {
        ob1 = o1;
        ob2 = o2;
        ob3 = o3;
    }

    public T returnOb1() {
        return ob1;
    }

    public V returnOb2() {
        return ob2;
    }

    public K returnOb3() {
        return ob3;
    }

    public void print() {
        System.out.println("T = " + ob1.getClass().getName() + "\nV = " + ob2.getClass().getName() + "\nK = " + ob3.getClass().getName());
    }

  public static void main(String[] args) {
        CreateDiamonds<String, Animal, Integer> createDiamonds = new CreateDiamonds<>("B", new Animal(), 33);
        CreateDiamonds<String, Animal, Float> createDiamonds1 = new CreateDiamonds<>("A", new Animal(), 2.33f);
        createDiamonds.print();
        createDiamonds1.print();
    }

}
