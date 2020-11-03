package com.pratica.livro.comoprogramar.c06.exercises;

import java.util.Scanner;

/**
 * (Conversões de temperatura) Implemente os seguintes métodos inteiros:
 * a) O método celsius retorna o equivalente em Celsius de uma temperatura em Fahrenheit utilizando o cálculo
 * celsius = 5.0 / 9.0 * (fahrenheit - 32);
 * b) O método fahrenheit retorna o equivalente em Fahrenheit de uma temperatura em Celsius utilizando o cálculo
 * fahrenheit = 9.0 / 5.0 * celsius + 32;
 * c) Utilize os métodos nas partes (a) e (b) para escrever um aplicativo que permite ao usuário inserir uma temperatura em Fahrenheit e
 * exibir o equivalente em Celsius ou inserir uma temperatura em Celsius e exibir o equivalente em Fahrenheit.
 */

public class Exercise6_22 {

    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            menu();
            System.out.print("Select mode: ");
            int mode = INPUT.nextInt();

            switch (mode) {
                case 1:
                    System.out.print("Enter Fahrenheit: ");
                    double fahrenheit = INPUT.nextDouble();
                    System.out.printf("Temperature in Celsius: %.2f%n%n", toCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.print("Enter Celsius: ");
                    double celsius = INPUT.nextDouble();
                    System.out.printf("Temperature in Fahrenheit: %.2f%n%n", toFahrenheit(celsius));
                    break;
                default:
                    System.out.printf("No mode selected!%n%n");
            }
            System.out.printf("Wish continue? S/N ");
            String again = INPUT.next();
            System.out.println();
            if (again.compareToIgnoreCase("n") == 0) {
                break;
            }
        }
    }

    public static double toCelsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    public static double toFahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }

    public static void menu() {
        System.out.println("----[ TEMPERATURE CONVERTER ]----");
        System.out.println("1 - Fahrenheit to Celsius");
        System.out.println("2 - Celsius to Fahrenheit");
        System.out.printf("0 - Exit%n%n");
    }
}
