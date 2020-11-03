package com.pratica.livro.comoprogramar.c07.sc07_13;

public class VarargsApp {

    public static void main(String[] args) {
        double d1 = 18;
        double d2 = 25;
        double d3 = 30;
        double d4 = 9;
        double d5 = 63;

        System.out.printf("Average: %.1f", average(d1));
        System.out.printf("%nAverage: %.1f", average(d1, d2));
        System.out.printf("%nAverage: %.1f", average(d1, d2, d3));
        System.out.printf("%nAverage: %.1f", average(d1, d2, d3, d4, d5));
    }

    public static double average(double... numbers) {
        double total = 0;
        for (double number : numbers) {
            total += number;
        }
        return total / numbers.length;
    }
}
