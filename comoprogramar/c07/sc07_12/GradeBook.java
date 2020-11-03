package com.pratica.livro.comoprogramar.c07.sc07_12;

public class GradeBook {

    private String courseName;
    private int[][] grades;

    public GradeBook(String courseName, int[][] grades) {
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
        System.out.printf("%n%s %d%n%s %d%n%n",
                "Lowest grade in the grade book is", getMinimun(),
                "Highest grade in the grade book is", getMaximun());
        outpuBarChart();

    }

    public int getMinimun() {
        int lowGrade = grades[0][0];
        for (int[] studentsGrades : grades) {
            for (int grade : studentsGrades) {
                if (grade < lowGrade) {
                    lowGrade = grade;
                }
            }
        }
        return lowGrade;
    }

    public int getMaximun() {
        int highGrade = grades[0][0];
        for (int[] studentsGrades : grades) {
            for (int grade : studentsGrades) {
                if (grade > highGrade) {
                    highGrade = grade;
                }
            }
        }
        return highGrade;
    }

    public double getAverage(int[] setOfGrades) {
        int total = 0;
        for (int grade : setOfGrades) {
            total += grade;
        }
        return (double) total / setOfGrades.length;
    }

    public void outpuBarChart() {
        System.out.println("Overall grade distribution:");
        int[] frequency = new int[11];
        for (int[] studentsGrade : grades) {
            for (int grade : studentsGrade) {
                ++frequency[grade / 10];
            }
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

    public void outputGrades() {
        System.out.printf("The grades are:%n%n");
        System.out.print("              ");
        for (int test = 0; test < grades[0].length; test++) {
            System.out.printf("Test: %d ", test + 1);
        }
        System.out.println("Average");
        for (int students = 0; students < grades.length; students++) {
            System.out.printf("Student: %2d ", students + 1);
            for (int test : grades[students]) {
                System.out.printf("%8d ", test);
            }
            double average = getAverage(grades[students]);
            System.out.printf("%9.2f%n", average);
        }
    }
}
