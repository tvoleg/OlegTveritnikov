package com.lesson1.lesson13;

public class Report {
    public static void generateReport (Employee[] e){
        for (Employee employee : e){
            System.out.printf("Работник: %-10s с зарплатой - %.2f\n", employee.getFullName(), employee.getSalary());
        }
    }

    public static void main(String[] args) {
        Employee person1 = new Employee("Petr D", 3050.345435);
        Employee person2 = new Employee("Kate M", 4300.2352);
        Employee person3 = new Employee("John R", 10000.12345);
        Employee[] moneyMonth = new Employee[]{person1, person2, person3};
        generateReport(moneyMonth);
    }
}
