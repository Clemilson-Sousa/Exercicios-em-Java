package com.pratica.livro.comoprogramar.c04.exercises.ex04_23;

import java.util.Scanner;

/**
 * (Encontre os dois números maiores) Utilizando uma abordagem semelhante àquela do Exercício 4.21, encontre os dois maiores valores
 * entre os 10 valores inseridos. [Observação: você só pode inserir cada número uma vez.]
 * <p>
 * se numero for maio que numero1
 * numero1 = numero
 * if numero1 for maior que numero2
 * numero2 = numero1
 */
public class TwoLargestNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int counter = 1;
        int number = 0;
        int largest_1 = 0;
        int largest_2 = 0;

        while (counter <= 4) {
            System.out.print("Enter number: ");
            number = input.nextInt();

            if (number > largest_1)
                largest_1 = number;
            else
                if (number > largest_2 && number != largest_1){
                    largest_2 = number;
                }

//                do {
//                    System.out.print("Enter number: ");
//                    number = input.nextInt();
//                    if (number == largest_1 || number == largest_2)
//                        System.out.printf("Tray again!%n");
//
//                } while (number == largest_1 || number == largest_2);

            counter++;
        }
        System.out.printf("Largest number: %d and %d", largest_1, largest_2);
    }
}
