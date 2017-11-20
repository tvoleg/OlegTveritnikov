package com.lesson1.lesson17.heavyBox;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HBIterator {
    public static void main(String[] args) {
        List<HeavyBox> smallBox = new ArrayList<>();
        smallBox.add(new HeavyBox(100, 301, 29));
        smallBox.add(new HeavyBox(300, 500, 99));
        smallBox.add(new HeavyBox(999, 111, 999));
        IterateBox(smallBox);
    }

    private static void IterateBox(List<HeavyBox> smallBox) {
        Iterator<HeavyBox> iterator = smallBox.iterator();
        List<HeavyBox> bigBox = new ArrayList<>();
        while (iterator.hasNext()) {
            HeavyBox hb = iterator.next();
            if (hb.getWeight() <= 300) {
                System.out.println("Collection 1: " + hb);
                iterator.remove();
                bigBox.add(hb);
            }
        }
    }
}

