package com.lesson1.StudentAspirant;


public class Student {
    private String lastName;
    int scholar = 100;

    public Student(String lastName) {
    }

    public Student() {
    }

    public int getSchoolarship() {
        return scholar;

    }

    public static void main(String[] args) {

        Student[] students = new Student[3];
        students[0] = new Student("John");
        students[1] = new Student("Alex");
        students[2] = new Aspirant("Science", "John");
        for (Student student : students) {
            System.out.println(student.getSchoolarship());
        }
    }
}
