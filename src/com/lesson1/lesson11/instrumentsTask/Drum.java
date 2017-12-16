package com.lesson1.lesson11.instrumentsTask;

public class Drum implements Instrument {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Drum(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан с размером = " + size);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Drum drum = (Drum) o;

        return size == drum.size;
    }

    @Override
    public int hashCode() {
        return size;
    }

    @Override
    public String toString() {
        return "Drum{" +
                "size=" + size;
    }
}
