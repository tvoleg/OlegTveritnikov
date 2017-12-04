package com.lesson1.lesson9.driveCar.professions;

public class DriverPerson {
    private int age;
    private String fullName;

    public DriverPerson(String fullName, int age) {
        this.age = age;
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "DriverPerson{" +
                "age=" + age +
                ", fullName='" + fullName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DriverPerson that = (DriverPerson) o;

        if (age != that.age) return false;
        return fullName != null ? fullName.equals(that.fullName) : that.fullName == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        return result;
    }
}
