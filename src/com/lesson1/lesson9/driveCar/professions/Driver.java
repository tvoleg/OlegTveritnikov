package com.lesson1.lesson9.driveCar.professions;


public class Driver extends DriverPerson {
    private int experience;

    public Driver(String fullName, int age, int experience) {
        super(fullName, age);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public static void main(String[] args) {
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experience=" + experience +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Driver driver = (Driver) o;

        return experience == driver.experience;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + experience;
        return result;
    }
}
