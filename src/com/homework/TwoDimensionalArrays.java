package com.homework;

public class TwoDimensionalArrays {
    public static int[][] createRandomMatrix(int rows, int columns, int minValue, int maxValue) {
        if (rows <= 0) rows = 10;
        if (columns <= 0) columns = 10;
        int [][] matrix = new int[rows][columns];
        int max = maxValue - minValue + 1;
        if (minValue == 0) {
            maxValue = 0;
        }
        else if (minValue > 0) {
            maxValue = -minValue;
            max--;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) Math.round((Math.random() * max) - maxValue);
            }
        }

        return matrix;
    }
}
