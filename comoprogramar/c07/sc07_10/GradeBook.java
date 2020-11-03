package com.pratica.livro.comoprogramar.c07.sc07_10;

public class GradeBook {

    private String courseName;
    private int[] grades;

    public GradeBook(String courseName, int[] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void processGrade() {
        outputGrades();
        System.out.printf("Class average: %.2f%n", getAverage());
        System.out.printf("Lowest grade: %d%n", getMinimum());
        System.out.printf("Highest grade: %d%n", getMaximum());
        outputBarChart();
    }

    public void outputBarChart() {
        System.out.println("Grade distribution:");
        int[] frequency = new int[11];
        for (int grade : grades) {
            ++frequency[grade / 10];
        }
        for (int count = 0; count < frequency.length; count++) {
            if (count == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
            }

            for (int stars = 0; stars < frequency[count]; stars++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public int getMinimum() {
        int lowtGrade = grades[0];
        for (int grade : grades) {
            if (grade < lowtGrade) {
                lowtGrade = grade;
            }
        }
        return lowtGrade;
    }

    public int getMaximum() {
        int highGrade = grades[0];
        for (int grade : grades) {
            if (grade > highGrade) {
                highGrade = grade;
            }
        }
        return highGrade;
    }

    public double getAverage() {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return (double) total / grades.length;
    }

    public void outputGrades() {
        System.out.printf("The grades students:%n");
        for (int students = 0; students < grades.length; students++) {
            System.out.printf("Student %2d: %3d%n", students + 1, grades[students]);
        }
    }
}
