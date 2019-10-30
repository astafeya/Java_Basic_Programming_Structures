package com.homework;

public class Sorting {
    public static int[] createRandomArray(int size, int minValue, int maxValue) {
        if (size < 0) size = 10;
        int[] array = new int[size];
        int max = maxValue - minValue + 1;
        for (int i = 0; i < size; i++) {
            array[i] = (int) Math.round((Math.random() * max) - maxValue);
        }
        return array;
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
