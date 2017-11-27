package com.lesson1.lesson17.pet;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PetDemo {
    public static void main(String[] args) {
        Map<String, Pet> pet = new HashMap<>();
        pet.put("Bars", new Cat("Bars", "House A"));
        pet.put("Kesha", new Parrot("Kesha", "House B"));
        pet.put("Prince", new Cat("Prince", "House C"));

        iterateKeys(pet);

        System.out.println(pet.get("Prince"));
    }

    private static void iterateKeys(Map<String, Pet> pet) {
        Set<String> keys = pet.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
    }
}
