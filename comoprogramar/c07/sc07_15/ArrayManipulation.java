package com.pratica.livro.comoprogramar.c07.sc07_15;

import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args) {

        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};

        System.out.printf("Original array:%n");
        for (double value : doubleArray)
            System.out.printf("%.2f ", value);

        Arrays.sort(doubleArray);

        System.out.printf("%nIncreasing array:%n");
        for (double value : doubleArray)
            System.out.printf("%.2f ", value);

        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray, 7);

        dysplayArray(filledIntArray, "filledIntArray");

        int[] intArray = {1, 2, 3, 4, 5, 6};
        int[] intArrayCopy = new int[intArray.length];

        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        dysplayArray(intArray, "intArray");
        dysplayArray(intArrayCopy, "intArrayCopy");

        boolean b = Arrays.equals(intArray, filledIntArray);

        System.out.printf("%nintArray %s filledIntArray", (b ? "is" : "isn't"));

        int location = Arrays.binarySearch(intArray, 5);
        if (location >= 0)
            System.out.printf("%nFound 5 at element %d in intArray", location);
        else
            System.out.printf("%n5 not found in intArray");

        location = Arrays.binarySearch(intArray, 8763);
        if (location >= 0)
            System.out.printf("%nFound 8763 at element %d in intArray", location);
        else
            System.out.printf("%n8763 not found in intArray");
    }

    public static void dysplayArray(int[] array, String description) {
        System.out.printf("%n%s%n", description);
        for (int value : array)
            System.out.printf("%d ", value);
    }
}
