package com.homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int size = 25;
        int minValue = -100;
        int maxValue = 100;
        Sorting.runTimeEvaluationAscendingSorting(size, minValue, maxValue);
        Sorting.runTimeEvaluationDescendingSorting(size, minValue, maxValue);

        System.out.println(" ");

        long value = 25;
        Factorial.runTimeEvaluation(value);

        int rows = 8;
        int columns = 8;
        int[][] matrix = TwoDimensionalArrays.createRandomMatrix(rows, columns, 10, 20);

        TwoDimensionalArrays.outputMatrix(matrix, rows, columns);
    }
}
