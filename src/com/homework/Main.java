package com.homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int size = 25;
        int minValue = -100;
        int maxValue = 100;
        Sorting.runTimeEvaluationAscendingSorting(size, minValue, maxValue);
        Sorting.runTimeEvaluationDescendingSorting(size, minValue, maxValue);
    }
}
