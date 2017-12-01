package com.lesson1.lesson9.studentAspirant;

public class Aspirant extends Student {
    private String work = "Science";
    private int scholar = 200;

    public Aspirant(String w, String name) {
        super(name);
        this.work = w;
    }

    public Aspirant(String name, int scholar) {
        super(name);
        this.scholar = scholar;
    }

    public int getSchoolarship() {
        return scholar;
    }

    public static void main(String[] args) {
        Student student = new Aspirant("John", 3333);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Aspirant aspirant = (Aspirant) o;

        if (scholar != aspirant.scholar) return false;
        return work != null ? work.equals(aspirant.work) : aspirant.work == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (work != null ? work.hashCode() : 0);
        result = 31 * result + scholar;
        return result;
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "work='" + work + '\'' +
                ", scholar=" + scholar +
                "} " + super.toString();
    }
}