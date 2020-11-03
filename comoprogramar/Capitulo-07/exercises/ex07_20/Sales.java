package com.pratica.livro.comoprogramar.c07.exercises.ex07_20;

import java.util.Scanner;

public class Sales {

    public static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        double[][] sales = new double[5][4];
        double[] salesmanSale = new double[4];
        int selesmanNumber;
        int productNumber;
        double soldTotal;

        String exit;

        do {
            System.out.print("Salesman: ");
            selesmanNumber = INPUT.nextInt();
            System.out.print("Product: ");
            productNumber = INPUT.nextInt();
            System.out.print("Sale value: ");
            soldTotal = INPUT.nextInt();

            sales[productNumber - 1][selesmanNumber - 1] = soldTotal;

            System.out.println("Wish to continue (S/N)?: ");
            exit = INPUT.next();
        } while (exit.equalsIgnoreCase("s"));

        System.out.printf("\t\t%s%s%s%s%n", "Saleman 1 |", " Saleman 2 |", " Saleman 3 |", " Saleman 4");
        for (int row = 0; row < sales.length; row++) {
            System.out.printf("Item %d\t", row + 1);
            for (int column = 0; column < sales[row].length; column++) {
                System.out.printf("%.2f\t\t", sales[row][column]);
                salesmanSale[column] += sales[row][column];
                soldTotal += sales[row][column];
            }
            System.out.printf("= %.2f", soldTotal);
            soldTotal = 0;
            System.out.println();
        }
        for (double value : salesmanSale)
            System.out.printf("\t\t%.2f", value);
    }
}
