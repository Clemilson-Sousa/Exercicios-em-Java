package com.pratica.livro.comoprogramar.c06.exercises;

import java.util.Scanner;

/**
 * Escreva um método qualityPoints que insere a média de um aluno e retorna 4 se for 90 a 100, 3 se 80 a 89, 2 se 70 a 79, 1 se 60 a 69
 * e 0 se menor que 60. Incorpore o método a um aplicativo que lê um valor a partir do usuário e exibe o resultado.
 */

public class Exercise6_28 {

    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter student's grade average: ");
        int grade = INPUT.nextInt();

        System.out.printf("Student's grade: %d", qualityPoints(grade));
    }

    public static int qualityPoints(int gradeAverage) {
        if (gradeAverage >= 90 && gradeAverage <= 100) {
            return 4;
        } else if (gradeAverage >= 80 && gradeAverage <= 89) {
            return 3;
        } else if (gradeAverage >= 70 && gradeAverage <= 79) {
            return 2;
        } else if (gradeAverage >= 60 && gradeAverage <= 69) {
            return 1;
        }
        return 0;
    }
}
