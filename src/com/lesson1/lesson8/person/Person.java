package com.lesson1.lesson8.person;

public class Person {
    private String fullName = "Alex";
    private int age = 34;

    Person man = new Person();
    Person women = new Person(fullName,age);

   // Person.setFullname ("Alex");
   // Person.setAge(30)
    Person() {
    }
    Person(String fullName, int age) {
    }
}


