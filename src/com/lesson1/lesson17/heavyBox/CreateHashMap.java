package com.lesson1.lesson17.heavyBox;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CreateHashMap {
    public static void main(String[] args) {
        Map<String, Toy> map = new HashMap<>();
        map.put("Doll", new Toy("Doll", 33));
        map.put("Box", new Toy("Box", 44));
        map.put("Car", new Toy("Car", 55));

        iteratorEntries(map);

        iteratorKeys(map);

        iterateValues(map);
    }

    private static void iterateValues(Map<String, Toy> map) {
        Collection<Toy> values = map.values();
        for (Toy value : values) {
            System.out.println(value);
        }
    }

    private static void iteratorKeys(Map<String, Toy> map) {
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }

    private static void iteratorEntries(Map<String, Toy> map) {
        Set<Map.Entry<String, Toy>> entries = map.entrySet();
        for (Map.Entry<String, Toy> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
