package com.pratica.livro.comoprogramar.c07.sc07_10;

public class GradeBookApp {
    public static void main(String[] args) {

        int[] grades = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        GradeBook myGradeBook = new GradeBook("Java - Learging Programming", grades);

        System.out.printf("Welcome to the Grade Book for%n%s%n", myGradeBook.getCourseName());
        myGradeBook.processGrade();
    }
}
