package com.lesson1.lesson19.animalSerializable;

import java.io.Serializable;

public class Halter implements Serializable {
    private String model;

    public Halter(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
