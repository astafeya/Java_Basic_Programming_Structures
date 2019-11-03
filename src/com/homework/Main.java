package com.homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Class Sorting");
        Sorting.runTimeEvaluationAscendingSorting(25, -100, 100);
        Sorting.runTimeEvaluationDescendingSorting(25, -100, 100);

        System.out.println("\nClass Factorial");
        Factorial.runTimeEvaluation((long) 25);

        System.out.println("\nClass Drawing");
        Drawing.drawRectangle(5, 10);
        Drawing.drawTriangle(8, "upper-left");
        Drawing.drawTriangle(8, "bottom-left");
        Drawing.drawTriangle(8, "upper-right");
        Drawing.drawTriangle(8, "bottom-right");

        System.out.println("\nClass OneDimensionalArrays");
        System.out.println("Task a");
        int[] array1 = OneDimensionalArrays.createOddNumbersArray(1, 99);
        OneDimensionalArrays.outputArray(array1);
        Sorting.selectionSortingDescending(array1);
        OneDimensionalArrays.outputArray(array1);

        System.out.println("\nTask b");
        int[] array2 = OneDimensionalArrays.createRandomArray(20, 0, 10);
        OneDimensionalArrays.outputArray(array2);
        System.out.println(OneDimensionalArrays.countOddAndEvenElements(array2));

        System.out.println("\nTask c");
        int[] array3 = OneDimensionalArrays.createRandomArray(10, 1, 100);
        OneDimensionalArrays.outputArray(array3);
        OneDimensionalArrays.replaceOddIndexes(array3, 0);
        OneDimensionalArrays.outputArray(array3);

        System.out.println("\nTask d");
        int[] array4 = OneDimensionalArrays.createRandomArray(15, -50, 50);
        System.out.println(OneDimensionalArrays.findMaxAndMin(array4));

        System.out.println("\nTask e");
        int[] array5 = OneDimensionalArrays.createRandomArray(10, 0, 10);
        int[] array6 = OneDimensionalArrays.createRandomArray(10, 0, 10);
        OneDimensionalArrays.outputArray(array5);
        OneDimensionalArrays.outputArray(array6);
        System.out.println("Avarage of array 1 = " + OneDimensionalArrays.findAvarage(array5));
        System.out.println("Avarage of array 2 = " + OneDimensionalArrays.findAvarage(array6));
        System.out.println(OneDimensionalArrays.compareAvarage(array5, array6));

        System.out.println("\nTask f");
        int[] array7 = OneDimensionalArrays.createRandomArray(20, -1, 1);
        OneDimensionalArrays.outputArray(array7);
        OneDimensionalArrays.outputArray(OneDimensionalArrays.findMostCommonElement(array7));

        /*System.out.println("\nClass TwoDimensionalArrays");
        System.out.println("Task a\n");
        System.out.println("\nTask b\n");
        System.out.println("\nTask c\n");
        System.out.println("\nTask d\n");*/
    }
}
