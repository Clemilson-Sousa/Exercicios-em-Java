package com.pratica.livro.comoprogramar.c04.sc04_7;

public class StudentApp {
    public static void main(String[] args) {

        Student student1 = new Student("Clemilson", 83.5);
        Student student2 = new Student("Kamila", 68.3);

        status(student1);
        status(student2);
    }

    public static void status (Student student) {
        System.out.printf("Student: %s - Grade: %s%n", student.getName(), student.getLetterGrade());
    }
}
