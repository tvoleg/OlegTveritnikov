package com.lesson1.lesson11.instrumentsTask;

public class Guitar implements Instrument {
    private int numberOfStrings;

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с количеством струн = " + numberOfStrings);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Guitar guitar = (Guitar) o;

        return numberOfStrings == guitar.numberOfStrings;
    }

    @Override
    public int hashCode() {
        return numberOfStrings;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "numberOfStrings=" + numberOfStrings +
                '}';
    }
}
