package com.pratica.livro.comoprogramar.c07.sc07_11;

public class InitArray {
    public static void main(String[] args) {

        int[][] array1 = {{1, 2}, {3, 4}, {5, 6, 7}};
        int[][] array2 = {{1, 2, 3}, {4}, {5, 6}};

        System.out.println("Elements of the array1:");
        outputArray(array1);
        System.out.println("\nElements of the array2:");
        outputArray(array2);

    }
    
    public static void outputArray(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.printf("%d ", array[row][column]);
            }
            System.out.println();
        }
    }
}
