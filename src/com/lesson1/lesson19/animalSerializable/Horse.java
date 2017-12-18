package com.lesson1.lesson19.animalSerializable;

import java.io.Serializable;

public class Horse implements Serializable {
    private Halter halter;
    private String name;

    public Horse(String name) {
        this.name = name;
    }

    public Halter getHalter() {
        return halter;
    }

    public void setHalter(Halter halter) {
        this.halter = halter;
    }
}
