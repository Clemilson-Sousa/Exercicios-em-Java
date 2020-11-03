package com.pratica.livro.comoprogramar.c02.sc02_5;

import java.util.Scanner;

public class SubChapter02_5_A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.printf("%nResult: %d + %d = %d ", number1, number2, sum);
    }
}
