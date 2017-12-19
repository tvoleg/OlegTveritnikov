package com.lesson1.lesson8.person;

public class Person {
    private String fullName;
    private int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
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

    public void move() {
        System.out.println("Person name: " + getFullName() + ", with age: " + getAge() + " is going.");
    }

    public void talk() {
        System.out.println("Person name: " + getFullName() + ", with age: " + getAge() + " is talking.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return fullName != null ? fullName.equals(person.fullName) : person.fullName == null;
    }

    @Override
    public int hashCode() {
        int result = fullName != null ? fullName.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return String.format("Person: " +
                "fullName: %s , age: %d", fullName, age);
    }

    public static void main(String[] args) {
        Person man = new Person("Alex", 33);
        Person woman = new Person();
        man.move();
        woman.talk();
        System.out.println(man.toString());
        System.out.println(woman.toString());
    }
}


