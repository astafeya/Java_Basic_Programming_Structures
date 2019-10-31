package com.homework;

import java.util.Arrays;

public class Sorting {
    public static void runTimeEvaluationAscendingSorting(int size, int minValue, int maxValue) {
        int[] array = OneDimensionalArrays.createRandomArray(size, minValue, maxValue);
        int[] copyArray = new int[size];
        long startTime;
        long estimatedTime;

        getCopy(array, copyArray);
        startTime = System.nanoTime();
        Sorting.bubbleSortingAscending(copyArray);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("bubbleSortingAscending: " + estimatedTime);

        getCopy(array, copyArray);
        startTime = System.nanoTime();
        Sorting.selectionSortingAscending(copyArray);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("selectionSortingAscending: " + estimatedTime);

        getCopy(array, copyArray);
        startTime = System.nanoTime();
        Arrays.sort(copyArray);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("integratedSortingAscending: " + estimatedTime);
    }

    public static void runTimeEvaluationDescendingSorting(int size, int minValue, int maxValue) {
        int[] array = OneDimensionalArrays.createRandomArray(size, minValue, maxValue);
        int[] copyArray = new int[size];
        long startTime;
        long estimatedTime;

        getCopy(array, copyArray);
        startTime = System.nanoTime();
        Sorting.bubbleSortingDescending(copyArray);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("bubbleSortingDescending: " + estimatedTime);

        getCopy(array, copyArray);
        startTime = System.nanoTime();
        Sorting.selectionSortingDescending(copyArray);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("selectionSortingDescending: " + estimatedTime);

        getCopy(array, copyArray);
        startTime = System.nanoTime();
        Arrays.sort(copyArray);
        for (int i = 0, j = copyArray.length - 1; i < j; i++, j--) {
            int tmp = copyArray[i];
            copyArray[i] = copyArray[j];
            copyArray[j] = tmp;
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("integratedSortingDescending: " + estimatedTime);
    }

    private static void getCopy(int[] array, int[] copy) {
        if (array.length != copy.length) {
            return;
        }

        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return;
    }

    public static void bubbleSortingDescending(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            int tmp;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    isSorted = false;
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;

                }
            }
        }
    }

    public static void bubbleSortingAscending(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            int tmp;
            for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        isSorted = false;
                        tmp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = tmp;

                }
            }
        }
    }

    public static void selectionSortingDescending(int[] array) {
        int tmp;
        for (int i = 0; i < array.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[max]) {
                    max = j;
                }
            }
            tmp = array[i];
            array[i] = array[max];
            array[max] = tmp;
        }
    }

    public static void selectionSortingAscending(int[] array) {
        int tmp;
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }
    }
}
