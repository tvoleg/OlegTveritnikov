package com.lesson1.lesson17.heavyBox;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, Toy> map = new TreeMap<>();
        map.put("Doll", new Toy("Doll", 33));
        map.put("Box", new Toy("Box", 44));
        map.put("Car", new Toy("Car", 55));

        iteratorKeys(map);
    }

    private static void iteratorKeys(Map<String, Toy> map) {
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }
}
