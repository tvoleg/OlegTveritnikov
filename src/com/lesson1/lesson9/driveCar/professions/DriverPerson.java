package com.lesson1.lesson9.driveCar.professions;

public class DriverPerson {
    public int age;
    public String fullName;

    public DriverPerson(String fullName, int age) {
        super();
        this.age = age;
        this.fullName = fullName;
    }


    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public static void main(String[] args) {
    }

    @Override
    public String toString() {
        return "DriverPerson{" +
                "age=" + age +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
