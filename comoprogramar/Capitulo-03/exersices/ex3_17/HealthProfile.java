package com.pratica.livro.comoprogramar.c03.exersices.ex3_17;

public class HealthProfile {

    private String name;
    private String lastName;
    private String gender;
    private int month;
    private int day;
    private int year;
    private double weight;
    private double height;

    public HealthProfile(String name, String lastName, String gender, int month, int day, int year, double weight, double height) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        if (month > 0 && month <= 12)
            this.month = month;
        if (day > 0 && day <= 31)
            this.day = day;
        if (year > 0)
            this.year = year;
        if (weight > 0)
            this.weight = weight;
        if (height > 0)
            this.height = height;
    }

    public double bmi () {
        return this.weight / (this.height * this.height);
    }

    public int healtRate (int maxHealtRate) {
        return (70 * ((maxHealtRate * 100) / 100)) / 100;
    }

    public int maxHealtRate (int age) {
        return 220 - age;
    }

    public int getAge(int currentYear) {
        return currentYear - this.year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 0 && month <= 12)
            this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 0 && day <= 31)
            this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0)
            this.year = year;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0)
            this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0)
            this.height = height;
    }
}
