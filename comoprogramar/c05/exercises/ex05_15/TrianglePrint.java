package com.pratica.livro.comoprogramar.c05.exercises.ex05_15;

/**
 * (Programa para impressão de triângulos) Escreva um aplicativo que exibe os seguintes padrões separadamente, um embaixo do outro.
 * Utilize loops for para gerar os padrões. Todos os asteriscos (*) devem ser impressos por uma única instrução na forma System.out.
 * print('*'); o que faz com que os asteriscos sejam impressos lado a lado. Uma instrução na forma System.out.println(); pode
 * ser utilizada para mover-se para a próxima linha. Uma instrução na forma System.out.print(' '); pode ser utilizada para exibir
 * um espaço para os últimos dois padrões. Não deve haver outras instruções de saída no programa. [Dica: os dois últimos padrões requerem
 * que cada linha inicie com um número adequado de espaços em branco.]
 * (a) (b) (c) (d)
 * * ********** ********** *
 * ** ********* ********* **
 * *** ******** ******** ***
 * **** ******* ******* ****
 * ***** ****** ****** *****
 * ****** ***** ***** ******
 * ******* **** **** *******
 * ******** *** *** ********
 * ********* ** ** *********
 * ********** * **********
 */

public class TrianglePrint {
    public static void main(String[] args) {

        int loop = 1;
        int loop2 = 9;

//        for (int line = 1; line <= loop; line++) {
//            System.out.print('*');
//            if (line == loop) {
//                loop++;
//                System.out.println();
//                line = 0;
//            }
//
//            if (loop == 11) {
//                line = 11;
//            }
//        }
//
//        System.out.println();
//        loop = 1;
//
//        for (int line = 10; line >= loop; line--) {
//            System.out.print('*');
//            if (line == loop) {
//                loop++;
//                System.out.println();
//                line = 11;
//            }
//        }
//
//        System.out.println();
//        loop = 1;
//
//        for (int line = 10; line >= loop; line--) {
//            System.out.print('*');
//            if (line == loop) {
//                loop++;
//                System.out.println();
//                line = 11;
//                for (int i = 1; i < loop; i++) {
//                    System.out.print(' ');
//                }
//            }
//        }
//
//        System.out.println();
//        loop = 1;

        for (int line = 1; line <= loop; line++) {
            if (true) {
                for (int i = 0; i < loop2; i++) {
                    System.out.print(' ');
                }
            }
            loop2--;
            System.out.print('*');
            if (line == loop) {
                loop++;
                System.out.println();
                line = 0;
            }

            if (loop == 11) {
                line = 11;
            }
        }
    }
}
