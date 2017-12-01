package com.lesson1.lesson9.studentAspirant;


public class Student {
    private String lastName;
    private int scholar = 100;

    public Student(String lastName) {
        this.lastName = lastName;
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
        students[3] = new Aspirant("Mike", 3333);
        for (Student student : students) {
            System.out.println(student.getSchoolarship());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (scholar != student.scholar) return false;
        return lastName != null ? lastName.equals(student.lastName) : student.lastName == null;

    }

    @Override
    public int hashCode() {
        int result = lastName != null ? lastName.hashCode() : 0;
        result = 31 * result + scholar;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", scholar=" + scholar +
                '}';
    }
}

