package com.homework;

public class Main {
    public static void main(String[] args) {
        int size = 25;
        int minValue = -100;
        int maxValue = 100;
        int[] array = Sorting.createRandomArray(size, minValue, maxValue);

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

        Sorting.bubbleSortingAscending(array);

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println(" ");

        Sorting.bubbleSortingDescending(array);
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
