package com.pratica.livro.comoprogramar.c05.exercises.ex05_17;

import java.util.Scanner;

/**
 * (Calculando vendas) Um varejista on-line vende cinco produtos cujos preços no varejo são como a seguir: produto 1, US$ 2,98; produto
 * 2, US$ 4,50; produto 3, US$ 9,98; produto 4, US$ 4,49 e produto 5, US$ 6,87. Escreva um aplicativo que leia uma série de pares de números
 * como segue:
 * a) número de produto
 * b) quantidade vendida
 * Seu programa deve utilizar uma instrução switch para determinar o preço de varejo de cada produto. Você deve calcular e exibir o valor de
 * varejo total de todos os produtos vendidos. Utilize um loop controlado por sentinela para determinar quando o programa deve parar o loop
 * e exibir os resultados finais.
 */

public class ProductSale {

    public static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        int code;
        int quantity;
        double totalValue = 0;

        String sentinel = "s";

        while (sentinel.equalsIgnoreCase("s")) {
            System.out.print("Code number: ");
            code = INPUT.nextInt();

            System.out.print("Quantity: ");
            quantity = INPUT.nextInt();

            switch (code) {
                case 1:
                    totalValue += quantity * 2.98;
                    break;
                case 2:
                    totalValue += quantity * 4.50;
                    break;
                case 3:
                    totalValue += quantity * 9.98;
                    break;
                case 4:
                    totalValue += quantity * 4.49;
                    break;
                case 5:
                    totalValue += quantity * 6.87;
            }

            System.out.printf("%nDo you wish to continue? S/N:");
            sentinel = INPUT.next();
        }

        System.out.printf("%n======== BALANCE ========%n");
        System.out.printf("Products sold: %.2f", totalValue);
    }
}
