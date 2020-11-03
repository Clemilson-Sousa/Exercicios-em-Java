package com.pratica.livro.comoprogramar.c02.exercises;

import java.util.Scanner;

public class Exe02_6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int result;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        System.out.print("Enter third integer: ");
        number3 = input.nextInt();

        result = number1 * number2 * number3;

        System.out.printf("%nProduct is %d", result);
    }
}
