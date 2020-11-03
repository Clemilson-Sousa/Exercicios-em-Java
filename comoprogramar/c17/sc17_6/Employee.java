package com.pratica.livro.comoprogramar.c17.sc17_6;

import java.util.Arrays;
import java.util.List;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private String department;

    public Employee(String fistName, String lasName, double salary, String department) {
        this.firstName = fistName;
        this.lastName = lasName;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return String.format("%s %s", getFirstName(), getLastName());
    }

    @Override
    public String toString() {
        return String.format("%-10s %-8s %8.2f %-8s", getFirstName(), getLastName(), getSalary(), getDepartment());
    }

    public static Employee[] banco() {
        return  new Employee[] {new Employee("Clemilson", "Sousa", 2543, "Development"),
                new Employee("Kamila", "Sousa", 1876, "Laboratory"),
                new Employee("Bruna", "Silva", 3648, "Recption"),
                new Employee("Julia", "Moura", 1349, "Farmacy"),
                new Employee("Silvia", "Lopes", 3157, "Laboratory"),
                new Employee("Renato", "Sousa", 1568, "Development")};
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
