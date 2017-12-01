package com.lesson1.lesson19.animalSerializable;

import java.io.*;

public class Animal implements Serializable {
    public static void main(String[] args) {
        Horse horse = new Horse("Lucky");
        Halter halter = new Halter("Model-1");
        serializable(horse);
        Horse deserializedHorse = deserialize();
    }

    public static void serializable(Horse horse) {
        try (FileOutputStream fs = new FileOutputStream("testSer.ser");
             ObjectOutputStream os = new ObjectOutputStream(fs)) {
            os.writeObject(horse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Horse deserialize() {
        Horse horse = null;
        try (FileInputStream fis = new FileInputStream("testSer.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            horse = (Horse) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return horse;
    }
}
