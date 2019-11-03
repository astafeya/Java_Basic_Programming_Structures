package com.homework;

import java.lang.reflect.Array;

public class TwoDimensionalArrays {
    public static int[][] createRandomMatrix(int rows, int columns, int minValue, int maxValue) {
        if (rows <= 0) rows = 10;
        if (columns <= 0) columns = 10;
        int [][] matrix = new int[rows][columns];
        int max = maxValue - minValue;
        if (minValue == 0) {
            maxValue = 0;
        }
        else if (minValue > 0) {
            maxValue = -minValue;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) Math.round((Math.random() * max) - maxValue);
            }
        }

        return matrix;
    }

    public static void outputMatrix(int[][] matrix, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static long sumMainDiagonalElements(int[][] matrix, int rows, int columns) {
        long result = 0;
        int minIndex = (rows > columns)? columns : rows;
        for (int i = 0; i < minIndex; i++) {
            result += matrix[i][i];
        }
        return result;
    }

    public static long multiplyMainDiagonalElements(int[][] matrix, int rows, int columns) {
        long result = 1;
        int minIndex = (rows > columns)? columns : rows;
        for (int i = 0; i < minIndex; i++) {
            result *= matrix[i][i];
        }
        return result;
    }

    public static long sumSideDiagonalElements(int[][] matrix, int rows, int columns) {
        long result = 0;
        int minIndex = (rows > columns)? columns : rows;
        for (int i = 0; i < minIndex; i++) {
            result += matrix[i][columns - 1 - i];
        }
        return result;
    }

    public static long multiplySideDiagonalElements(int[][] matrix, int rows, int columns) {
        long result = 1;
        int minIndex = (rows > columns)? columns : rows;
        for (int i = 0; i < minIndex; i++) {
            result *= matrix[i][columns - 1 - i];
        }
        return result;
    }

    public static String maxElementInMatrix(int[][] matrix, int rows, int columns) {
        int max = matrix[0][0];
        int maxRow = 0;
        int maxColumn = 0;

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }
        return "Max Element = " + max + "\nIndex: [" + maxRow + "][" + maxColumn + "]";
    }

    public static int rowWithMaxElementsAbsMultiply(int[][] matrix, int rows, int columns) {
        long[] multiplies = new long[rows];
        for (int i = 0; i < rows; i++) {
            long rowMultiply = 1;
            for (int j = 0; j < columns; j++){
                rowMultiply *= matrix[i][j];
            }
            multiplies[i] = Math.abs(rowMultiply);
        }
        int maxRow = 0;
        long max = multiplies[0];
        for (int i = 1; i < columns; i++) {
            if (multiplies[i] > max) {
                max = multiplies[i];
                maxRow = i;
            }
        }
        return maxRow;
    }

    public static void sortRowsDescending(int[][] matrix, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            int tmp;
            for (int j = 0; j < columns - 1; j++) {
                int max = j;
                for (int k = j + 1; k < columns; k++) {
                    if (matrix[i][k] > matrix[i][max]) {
                        max = k;
                    }
                }
                tmp = matrix[i][j];
                matrix[i][j] = matrix[i][max];
                matrix[i][max] = tmp;
            }
        }
    }
}
