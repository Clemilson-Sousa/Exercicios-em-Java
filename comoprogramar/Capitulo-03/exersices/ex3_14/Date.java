package com.pratica.livro.comoprogramar.c03.exersices.ex3_14;

public class Date {

    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        if (month > 0 && month <= 12) {
            this.month = month;
        }
        if (day > 0 && day <= 31) {
            this.day = day;
        }
        if (year > 0) {
            this.year = year;
        }
    }

    public void dysplayDate () {
        System.out.printf("%d/%d/%d%n", this.month, this.day, this.year);
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
