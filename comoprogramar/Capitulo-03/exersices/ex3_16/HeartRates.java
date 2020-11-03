package com.pratica.livro.comoprogramar.c03.exersices.ex3_16;

public class HeartRates {

    private String name;
    private String lastName;
    private int month;
    private int day;
    private int year;

    public HeartRates(String name, String lastName, int month, int day, int year) {
        this.name = name;
        this.lastName = lastName;
        if (month > 0 && month <= 12)
            this.month = month;
        if (day > 0 && day <= 31)
            this.day = day;
        if (year > 0)
            this.year = year;
    }

    public int age (int currentYear) {
        return currentYear - this.year;
    }

    public int maxHeartRates (int age) {
        return 220 - age;
    }

    public int heartRates (int maxHeartRates) {
        return (50 * ((maxHeartRates * 100) / 100)) / 100;
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

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
