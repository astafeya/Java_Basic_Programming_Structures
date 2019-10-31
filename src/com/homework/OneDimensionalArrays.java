package com.homework;

public class OneDimensionalArrays {
    public static int[] createRandomArray(int size, int minValue, int maxValue) {
        if (size <= 0) size = 10;
        int[] array = new int[size];
        int max = maxValue - minValue + 1;
        if (minValue == 0) {
            maxValue = 0;
        }
        else if (minValue > 0) {
            maxValue = -minValue;
            max--;
        }

        for (int i = 0; i < size; i++) {
            array[i] = (int) Math.round((Math.random() * max) - maxValue);
        }
        return array;
    }
}
