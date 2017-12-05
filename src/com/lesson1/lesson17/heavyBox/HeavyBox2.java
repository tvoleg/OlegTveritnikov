package com.lesson1.lesson17.heavyBox;

import java.util.SortedSet;
import java.util.TreeSet;

public class HeavyBox2 implements Comparable<HeavyBox2> {
    private int weight;
    private int height;
    private int depth;

    private HeavyBox2(int weight, int height, int depth) {
        this.weight = weight;
        this.height = height;
        this.depth = depth;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public static void main(String[] args) {
        SortedSet<HeavyBox2> hb2 = new TreeSet<>();
        hb2.add(new HeavyBox2(111, 222, 3));
        hb2.add(new HeavyBox2(111, 15, 28));
        hb2.add(new HeavyBox2(44, 325, 66));
        for (HeavyBox2 h : hb2) {
            System.out.println(h);
        }
    }

    @Override
    public int compareTo(HeavyBox2 heavyBox2) {
        int heavyBox2Weight = heavyBox2.getWeight();
        if (this.weight - heavyBox2Weight != 0) {
            return this.weight - heavyBox2Weight;
        } else {
            int heavyBox2Height = heavyBox2.getHeight();
            return this.height - heavyBox2Height;
        }
    }

    @Override
    public String toString() {
        return "HeavyBox2: " +
                "weight= " + weight +
                ", height= " + height +
                ", depth= " + depth;
    }
}
