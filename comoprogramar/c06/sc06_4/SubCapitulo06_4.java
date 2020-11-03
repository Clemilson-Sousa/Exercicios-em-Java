package com.pratica.livro.comoprogramar.c06.sc06_4;

import java.util.Scanner;

public class SubCapitulo06_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Value 1: ");
        double value1 = input.nextDouble();
        System.out.print("Value 1: ");
        double value2 = input.nextDouble();
        System.out.print("Value 1: ");
        double value3 = input.nextDouble();

        System.out.println("\nValue maximum: " + maximum(value1, value2, value3));
    }

    public static double maximum(double value1, double value2, double value3) {

        return Math.max(value1, Math.max(value2, value3));

//        double valueMax = value1;
//
//        if (value2 > valueMax) {
//            valueMax = value2;
//        }
//        if (value3 > valueMax) {
//            valueMax = value3;
//        }
//        return valueMax;
    }
}