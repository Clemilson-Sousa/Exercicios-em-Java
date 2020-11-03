package com.pratica.livro.comoprogramar.c07.sc07_8;

public class PassArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        System.out.print("Original array: ");
        for (int value : array) {
            System.out.printf(" %d", value);
        }

        modifyArray(array);

        System.out.printf("%nModify array: ");
        for (int value : array) {
            System.out.printf(" %d", value);
        }

        System.out.printf("%nOriginal element: %d%n", array[3]);

        modifyElement(array[3]);

    }

    public static void modifyArray(int[] array2) {
        for (int counter = 0; counter < array2.length; counter++) {
            array2[counter] *= 2;
        }
    }

    public static void modifyElement(int element) {
        element *= 2;
        System.out.printf("Value of element modify: %d", element);
    }
}
