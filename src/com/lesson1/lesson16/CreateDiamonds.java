package com.lesson1.lesson16;

public class CreateDiamonds<T, V, K> {
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
        CreateDiamonds<Integer, Integer, Integer> createDiamonds = new CreateDiamonds<>(11, 22, 33);
        CreateDiamonds<String, Double, Float> createDiamonds1 = new CreateDiamonds<>("A", 2.2, 2.33f);
        createDiamonds.print();
        createDiamonds1.print();
    }
}
